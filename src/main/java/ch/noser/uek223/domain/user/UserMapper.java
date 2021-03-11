package ch.noser.uek223.domain.user;
import ch.noser.uek223.domain.product.Product;
import ch.noser.uek223.domain.product.dto.ProductDTOWithBuyingPrice;
import ch.noser.uek223.domain.product.dto.ProductDTOWithRetailPrice;
import ch.noser.uek223.domain.user.dto.UserDTOSupplierDetail;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTOSupplierDetail   userToSupplierDetailDTO(User user);
    Set<UserDTOSupplierDetail> usersTOSupplierDetailDTO(Set<User> users);
    User userDTOToUser(UserDTOSupplierDetail dto);
}

