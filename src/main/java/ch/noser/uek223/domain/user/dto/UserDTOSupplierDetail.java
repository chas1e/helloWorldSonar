package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.dto.RoleDTO;

import javax.persistence.Column;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class UserDTOSupplierDetail {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Set<RoleDTO> roles;

   public UserDTOSupplierDetail(){

   }

    public UserDTOSupplierDetail(UUID id, String firstName, String lastName, String email, String password, Set<RoleDTO> roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public UUID getId() {
        return id;
    }

    public UserDTOSupplierDetail setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDTOSupplierDetail setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDTOSupplierDetail setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTOSupplierDetail setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTOSupplierDetail setPassword(String password) {
        this.password = password;
        return this;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public UserDTOSupplierDetail setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
        return this;
    }
}
