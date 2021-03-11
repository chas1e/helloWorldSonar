package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.product.Product;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.UUID;


public interface UserService extends UserDetailsService {
    User create(User entity);

    User save(User entity);

    Collection<User> createAll(Collection<User> entities);

    User findById(UUID id);

    Collection<User> findAll();

    User updateById(UUID id, User entity);

    void deleteById(UUID id);
}
