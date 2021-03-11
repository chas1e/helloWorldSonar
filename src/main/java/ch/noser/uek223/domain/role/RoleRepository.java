package ch.noser.uek223.domain.role;

import ch.noser.uek223.domain.authority.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

import java.util.UUID;

@org.springframework.stereotype.Repository
public interface RoleRepository extends
        JpaRepository<Role, UUID> {
}
