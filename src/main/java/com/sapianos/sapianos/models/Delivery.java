package com.sapianos.sapianos.models;

import javax.persistence.*;

@Entity
@Table(name= "delivery")
public class Delivery {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deliveryId")
    private int deliveryId;
    @Column(name ="locationCountry")
    private String locationCountry;
    @Column(name ="locationCity")
    private String locationCity;
    @Column(name ="locationStreet")
    private String locationStreet;
    @Column(name ="locationNumber")
    private int locationNumber;
    @Column(name ="productDataTime")
    private Integer productDataTime;

    public Delivery(){

    }

    public Delivery(int deliveryId, String locationCountry, String locationCity, String locationStreet,
                    int locationNumber, Integer productDataTime) {
        this.deliveryId = deliveryId;
        this.locationCountry = locationCountry;
        this.locationCity = locationCity;
        this.locationStreet = locationStreet;
        this.locationNumber = locationNumber;
        this.productDataTime = productDataTime;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationStreet() {
        return locationStreet;
    }

    public void setLocationStreet(String locationStreet) {
        this.locationStreet = locationStreet;
    }

    public int getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(int locationNumber) {
        this.locationNumber = locationNumber;
    }

    public Integer getProductDataTime() {
        return productDataTime;
    }

    public void setProductDataTime(Integer productDataTime) {
        this.productDataTime = productDataTime;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", locationCountry='" + locationCountry + '\'' +
                ", locationCity='" + locationCity + '\'' +
                ", locationStreet='" + locationStreet + '\'' +
                ", locationNumber=" + locationNumber +
                ", productDataTime=" + productDataTime +
                '}';
    }
}
