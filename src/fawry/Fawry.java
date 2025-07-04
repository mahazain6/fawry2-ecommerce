/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fawry;

/**
 *
 * @author lenovo
 */
public class Fawry {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Product cheese = new ShippableProduct("Cheese", 100, 5, true, 0.2);
        Product biscuits = new ShippableProduct("Biscuits", 150, 3, true, 0.7);
     

        cheese.setExpired(false);
        biscuits.setExpired(false);

        Customer customer = new Customer("Maha", 1000);
        Cart cart = new Cart();

        cart.add(cheese, 2);
        cart.add(biscuits, 1);
    

        CheckoutService.checkout(customer, cart);
    }
}
