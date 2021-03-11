package ch.noser.uek223.domain.product.dto;

import java.util.UUID;

public class ProductDTOWithRetailPrice {

    private UUID id;

    private String description;

    private double retailPrice;

    public ProductDTOWithRetailPrice(UUID id, String description, double retailPrice) {
        this.id = id;
        this.description = description;
        this.retailPrice = retailPrice;
    }

    public ProductDTOWithRetailPrice() {

    }

    public UUID getId() {
        return id;
    }

    public ProductDTOWithRetailPrice setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductDTOWithRetailPrice setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public ProductDTOWithRetailPrice setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
        return this;
    }
}
