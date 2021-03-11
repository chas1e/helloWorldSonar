package ch.noser.uek223.domain.authority;

import ch.noser.uek223.domain.authority.dto.AuthorityDTO;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface AuthorityMapper {
    AuthorityDTO authorityTOAuthorityDTO(Authority authority);
    Set<AuthorityDTO> authoritiesTOAuthoritiesDTO(Set<Authority> authorities);
}
