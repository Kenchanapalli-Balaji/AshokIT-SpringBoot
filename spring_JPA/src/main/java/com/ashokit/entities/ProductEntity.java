package com.ashokit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductEntity
{
    @Id
    private Integer productId;
    private String productName;
    private Integer productPrice;

    public ProductEntity(){}

    public ProductEntity(Integer productId, String productName, Integer productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
