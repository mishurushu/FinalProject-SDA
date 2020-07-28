package com.sapianos.sapianos.models;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private int productId;
    @Column(name ="productName")
    private String productName;
    @OneToOne
    @JoinColumn(name = "deliveryProduct")
    private Delivery delivery;
    @OneToOne
    @JoinColumn(name = "descriptionProduct")
    private Description descriptionProduct;
    @Column(name ="priceProduct")
    private int priceProduct;
    @OneToOne()
    @JoinColumn(name = "cook")
    private User cook;
    @OneToOne()
    @JoinColumn(name = "consumer")
    private User consumer;

    public Product(){

    }

    public Product(String productName, Description descriptionProduct, int priceProduct, User cook,
                   User consumer, Delivery delivery)
    {
        this.productName = productName;
        this.descriptionProduct = descriptionProduct;
        this.priceProduct = priceProduct;
        this.cook = cook;
        this.consumer = consumer;
        this.delivery = delivery;
    }

    public Product(int productId, String productName, Description descriptionProduct, int priceProduct, User cook,
                   User consumer, Delivery delivery)
    {
        this.productId = productId;
        this.productName = productName;
        this.descriptionProduct = descriptionProduct;
        this.priceProduct = priceProduct;
        this.cook = cook;
        this.consumer = consumer;
        this.delivery = delivery;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Description getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(Description descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public User getCook() {
        return cook;
    }

    public void setCook(User cook) {
        this.cook = cook;
    }

    public User getConsumer() {
        return consumer;
    }

    public void setConsumer(User consumer) {
        this.consumer = consumer;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", delivery=" + delivery +
                ", descriptionProduct=" + descriptionProduct +
                ", priceProduct=" + priceProduct +
                ", cook=" + cook +
                ", consumer=" + consumer +
                '}';
    }
}
