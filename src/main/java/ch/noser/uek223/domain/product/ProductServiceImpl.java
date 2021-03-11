package ch.noser.uek223.domain.product;

import org.apache.tomcat.jni.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @Override
    public List<Product> findWithPriceFilter(double lower, double upper){
        List<Product> productsWithPriceFilter = productRepository.findAll().stream().filter(product ->
                product.getRetailPrice() >= lower && product.getRetailPrice() <= upper).collect(Collectors.toList());
        return productsWithPriceFilter;

    }


    @Override
    public Product archive(UUID id){
        Optional<Product> product = productRepository.findById(id);
            product.get().setAvailability(Availability.ARCHIVED);
            return productRepository.save(product.get());
    }

    @Override
    public List<Product> findAvailableProducts(){
        List<Product> productsAvailable = productRepository.findAll()
                .stream().filter(product -> product.getAvailability()
                        .equals(Availability.IN_STOCK))
                .collect(Collectors.toList());
        return productsAvailable;
    }
}
