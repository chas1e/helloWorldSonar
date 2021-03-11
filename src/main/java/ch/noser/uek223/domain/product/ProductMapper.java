package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product.dto.ProductDTOWithBuyingPrice;
import ch.noser.uek223.domain.product.dto.ProductDTOWithRetailPrice;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTOWithBuyingPrice productToProductDTOWithBuyingPrice(Product product);
    ProductDTOWithRetailPrice productToProductDTOWithRetailPrice(Product product);
    List<ProductDTOWithBuyingPrice> productsToProductDTOWithBuyingPrice(List<Product> product);
    List<ProductDTOWithRetailPrice> productsToProductDTOWithRetailPrice (List<Product> product);
}
