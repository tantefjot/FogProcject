/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Rikke Nielsen
 */
public class Product {
  
    private int product_id;
    private String productName;
    private double productPrice;
    private int productLength;
    private int productHeigth;
    private int productWidth;

    public Product(int product_id, String productName, double productPrice, int productLength, int productHeigth, int productWidth) {
        this.product_id = product_id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productLength = productLength;
        this.productHeigth = productHeigth;
        this.productWidth = productWidth;
    }

    public Product(String productName, double productPrice, int productLength, int productHeigth, int productWidth) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productLength = productLength;
        this.productHeigth = productHeigth;
        this.productWidth = productWidth;
    }
    
    
    

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
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

    public int getProductLength() {
        return productLength;
    }

    public void setProductLength(int productLength) {
        this.productLength = productLength;
    }

    public int getProductHeigth() {
        return productHeigth;
    }

    public void setProductHeigth(int productHeigth) {
        this.productHeigth = productHeigth;
    }

    public int getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(int productWidth) {
        this.productWidth = productWidth;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", productName=" + productName + ", productPrice=" + productPrice + ", productLength=" + productLength + ", productHeigth=" + productHeigth + ", productWidth=" + productWidth + '}';
    }

    
}
