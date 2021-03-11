package ch.noser.uek223.domain.purchase_product;

import ch.noser.uek223.domain.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PurchaseProductRepository extends
        JpaRepository<PurchaseProduct, UUID> {
}
