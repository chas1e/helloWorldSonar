package ch.noser.uek223.domain.product;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public interface ProductService {
    List<Product> findAll();

    List<Product> findWithPriceFilter(double lower, double upper);

    Product archive(UUID id);

    List<Product> findAvailableProducts();
}
