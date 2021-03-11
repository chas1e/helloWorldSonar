package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.user.User;
import ch.noser.uek223.domain.user.dto.UserDTOSupplierDetail;

import java.util.UUID;

public class ProductDTOWithBuyingPrice {

        private UUID id;

        private String description;

        private double retailPrice;

        private double buyingPrice;

        private UserDTOSupplierDetail supplier;

    public ProductDTOWithBuyingPrice() {

    }

    public ProductDTOWithBuyingPrice(UUID id, String description, double retailPrice, double buyingPrice, UserDTOSupplierDetail supplier) {
        this.id = id;
        this.description = description;
        this.retailPrice = retailPrice;
        this.buyingPrice = buyingPrice;
        this.supplier = supplier;
    }

    public UUID getId() {
        return id;
    }

    public ProductDTOWithBuyingPrice setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductDTOWithBuyingPrice setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public ProductDTOWithBuyingPrice setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
        return this;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public ProductDTOWithBuyingPrice setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
        return this;
    }

    public UserDTOSupplierDetail getSupplier() {
        return supplier;
    }

    public ProductDTOWithBuyingPrice setSupplier(UserDTOSupplierDetail supplier) {
        this.supplier = supplier;
        return this;
    }
}
