package ch.noser.uek223.domain.role;

import ch.noser.uek223.domain.role.dto.RoleDTO;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleDTO roleToRoleDTO(Role role);
    Set<RoleDTO> rolesToRolesDTO(Set<Role> roles);
}
