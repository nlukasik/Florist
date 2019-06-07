package com.florist.projekt.domain;




import javax.persistence.*;

@Entity
@Table (name = "flower_order")
public class FlowerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;
    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "id_product")
    private String productId;
    @Column(name = "email")
    private String email;
    @Column(name = "adress")
    private String adress;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public FlowerOrder() {
    }
}