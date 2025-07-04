/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawry;

/**
 *
 * @author lenovo
 */
import java.util.List;
import java.util.ArrayList;
public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Error: Cart is empty.");
            return;
        }

        double subtotal = 0.0;
        double shippingFee = 0.0;
        List<Shippable> toShip = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            Product p = item.getProduct();
            int qty = item.getQuantity();

            if (p.isExpired()) {
                System.out.println("Error: " + p.getName() + " is expired.");
                return;
            }

            if (!p.isAvailable(qty)) {
                System.out.println("Error: Not enough quantity for " + p.getName());
                return;
            }

            double itemTotal = p.getPrice() * qty;
            subtotal += itemTotal;

        if (p.needsShipping() && p instanceof Shippable) {
    for (int i = 0; i < qty; i++) {
        toShip.add((Shippable) p);
    }
    shippingFee += 15; 
}

        }

        double total = subtotal + shippingFee;

        if (!customer.canAfford(total)) {
            System.out.println("Error: Insufficient balance.");
            return;
        }

        customer.deduct(total);

        if (!toShip.isEmpty()) {
            ShippingService.ship(toShip);
        }

        // Receipt
        System.out.println("\n** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
    Product product = item.getProduct();
    if (!(product.getName().equalsIgnoreCase("Scratch Card"))) {
        System.out.printf("%dx %s\t%.0f\n", item.getQuantity(), product.getName(),
                          item.getQuantity() * product.getPrice());
    }
}

        System.out.println("----------------------");
        System.out.printf("Subtotal\t%.0f\n", subtotal);
        System.out.printf("Shipping\t%.0f\n", shippingFee);
        System.out.printf("Amount\t\t%.0f\n", total);
     
    }
}
