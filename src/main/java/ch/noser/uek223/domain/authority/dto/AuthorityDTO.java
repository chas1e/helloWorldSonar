package ch.noser.uek223.domain.authority.dto;

import javax.persistence.Column;
import java.util.UUID;

public class AuthorityDTO {
    private UUID id;
    private String name;

    public AuthorityDTO(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public AuthorityDTO() {

    }

    public UUID getId() {
        return id;
    }

    public AuthorityDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AuthorityDTO setName(String name) {
        this.name = name;
        return this;
    }
}
