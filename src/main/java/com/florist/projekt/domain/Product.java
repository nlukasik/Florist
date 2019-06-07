package com.florist.projekt.domain;


import javax.persistence.*;


@Entity(name = "product")
@Table
public class Product {


    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_product")
    private int productId;
    @Column(name = "name")
    private String productName;
    @Column(name = "price")
    private double productPrice;


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

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product() {
    }

}