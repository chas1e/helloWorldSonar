package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product.dto.ProductDTOWithBuyingPrice;
import ch.noser.uek223.domain.product.dto.ProductDTOWithRetailPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class ProductWeb {
    private ProductMapper productMapper;
    private ProductService productService;

    @Autowired
    public ProductWeb(ProductService productService, ProductMapper productMapper)
    {
     this.productService = productService;
     this.productMapper = productMapper;
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductDTOWithBuyingPrice>> findAll(){
        return ResponseEntity.ok().body(productMapper.productsToProductDTOWithBuyingPrice(productService.findAll()));
    }

    @GetMapping("products/{lower}/{upper}")
    public ResponseEntity<List<Product>> findWithPriceFilter(@PathVariable double lower, @PathVariable double upper){
        return ResponseEntity.ok().body(productService.findWithPriceFilter(lower, upper));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Product> archive(@PathVariable UUID id){
        return ResponseEntity.ok().body(productService.archive(id));
    }

    @GetMapping("products/available")
    public ResponseEntity<List<Product>> findAvailableProducts(){
        return ResponseEntity.ok().body(productService.findAvailableProducts());
    }

}


