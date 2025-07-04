/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawry;

/**
 *
 * @author lenovo
 */
public class Product {
    protected String name;
    protected double price;
    protected int quantity;
    protected boolean isExpirable;
    protected boolean isShippable;
    protected boolean expired = false; // New field to track actual expiration

    public Product(String name, double price, int quantity, boolean isExpirable, boolean isShippable) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isExpirable = isExpirable;
        this.isShippable = isShippable;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public boolean isAvailable(int requestedQty) {
        return requestedQty <= quantity;
    }

    public void decreaseQuantity(int amount) {
        this.quantity -= amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean needsShipping() {
        return isShippable;
    }
}


