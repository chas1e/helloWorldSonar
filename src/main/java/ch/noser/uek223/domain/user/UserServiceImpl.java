package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.user.dto.UserDTOSupplierDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final BCryptPasswordEncoder encoder;

    public UserServiceImpl(UserRepository repository, BCryptPasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }


    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return repository.findByEmail(email).map(UserDetailsImpl::new).orElseThrow(() -> new UsernameNotFoundException(email));
    }

    @Override
    public User findById(UUID id) {
        Optional<User> optional = repository.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new NoSuchElementException(String.format("%s with ID '%s' not found", "User", id));
        }
    }

    @Override
    public Collection<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User create(User entity) throws RuntimeException {

        Optional<User> optional = repository.findByEmail(entity.getEmail());

        if(optional.isPresent()) {
            throw new RuntimeException(String.format("%s with Email '%s' already exists", "User", entity.getEmail()));
        }

        entity.setId(null);

        entity.setPassword(encoder.encode(entity.getPassword()));

        entity = repository.saveAndFlush(entity);

        return entity;
    }

    @Override
    public Collection<User> createAll(Collection<User> entities) {
        entities.forEach(entity -> entity.setId(null));

        entities = repository.saveAll(entities);
        repository.flush();

        return entities;
    }

    @Override
    public final User save(User entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public User updateById(UUID id, User entity) {

        if (repository.existsById(id) && id.equals(entity.getId())) {
            entity.setId(id);

            entity = repository.saveAndFlush(entity);

            return entity;
        } else {
            throw new NoSuchElementException(String.format("%s with ID '%s' not found", "User", id));
        }

    }

    @Override
    public final void deleteById(UUID id) throws NoSuchElementException {
        Optional<User> optional = repository.findById(id);

        if (optional.isPresent()) {
            repository.delete(optional.get());
        } else {
            throw new NoSuchElementException(String.format("%s with ID '%s' not found", "User", id));
        }
    }


}
