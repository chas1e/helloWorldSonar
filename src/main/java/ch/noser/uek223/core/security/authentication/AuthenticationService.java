package ch.noser.uek223.core.security.authentication;

import ch.noser.uek223.domain.user.dto.UserDTOSupplierDetail;

import java.util.UUID;

public interface AuthenticationService {

    UserDTOSupplierDetail getAuthenticationResponse(UUID userId);

    void authenticate(String authenticationHeader);

}
