package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.purchase_product.PurchaseProduct;
import ch.noser.uek223.domain.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
public class Product {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    private String description;
    @Column(nullable = false)
    private double retailPrice;
    @Column(nullable = false)
    private double buyingPrice;

    @Enumerated(EnumType.ORDINAL)
    private Availability availability;


    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private User supplier;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    @JsonBackReference
    private Set<PurchaseProduct> purchaseProducts;

    public Product(UUID id, String description, double retail_price, double buying_price, Availability availability, User supplier, Set<PurchaseProduct> purchaseProducts) {
        this.id = id;
        this.description = description;
        this.retailPrice = retail_price;
        this.buyingPrice = buying_price;
        this.availability = availability;
        this.supplier = supplier;
        this.purchaseProducts = purchaseProducts;
    }

    public Product(){

    }

    public UUID getId() {
        return id;
    }

    public Product setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public Product setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
        return this;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public Product setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
        return this;
    }

    public Availability getAvailability() {
        return availability;
    }

    public Product setAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }

    public User getSupplier() {
        return supplier;
    }

    public Product setSupplier(User supplier) {
        this.supplier = supplier;
        return this;
    }

    public Set<PurchaseProduct> getPurchaseProducts() {
        return purchaseProducts;
    }

    public Product setPurchaseProducts(Set<PurchaseProduct> purchaseProducts) {
        this.purchaseProducts = purchaseProducts;
        return this;
    }
}
