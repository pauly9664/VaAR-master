package com.example.padegich.vaar.models;

/**
 * @author padegich on 9/26/18.
 * @project VaAR
 */
public class Product {
    private int imageResourceId;
    private String productName;
    private String productPrice;
    private boolean isLoading = false;
    private boolean isNew = false;

    public Product(int imageResourceId, String productName, String productPrice, boolean isNew) {
        this.imageResourceId = imageResourceId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.isNew = isNew;
    }

    public Product() {
    }
    public boolean isNew() {
        return isNew;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public boolean isLoading() {
        return isLoading;
    }

    public void setLoading(boolean loading) {
        isLoading = loading;
    }
}
