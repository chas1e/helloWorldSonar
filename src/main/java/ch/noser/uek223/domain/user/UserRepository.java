package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository
        extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
}
