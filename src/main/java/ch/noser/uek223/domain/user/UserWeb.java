package ch.noser.uek223.domain.user;


import ch.noser.uek223.domain.product.Product;
import ch.noser.uek223.domain.user.dto.UserDTOSupplierDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class UserWeb {
    private UserService userService;
    private UserMapper userMapper;

    @Autowired
    public UserWeb(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/users")
    public ResponseEntity<Collection<User>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }

    @PostMapping("/users")
    public ResponseEntity<UserDTOSupplierDetail> create(@RequestBody UserDTOSupplierDetail user) {
        return new ResponseEntity<UserDTOSupplierDetail>(userMapper.
                userToSupplierDetailDTO(userService.create(userMapper.userDTOToUser(user))), HttpStatus.CREATED);
    }

}