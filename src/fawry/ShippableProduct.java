/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawry;

/**
 *
 * @author lenovo
 */
public class ShippableProduct extends Product implements Shippable {
    private final double weight;

    public ShippableProduct(String name, double price, int quantity, boolean isExpirable, double weight) {
        super(name, price, quantity, isExpirable, true);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
