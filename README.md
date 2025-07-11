README.md
-> E-Commerce System

This is a simple Java project that simulates an online e-commerce system with:

1- Expirable Products (like Cheese, Biscuits)  
2- Shippable Products (like Cheese, TV)  
3- Non-shippable, Non-expirable Products (like Mobile scratch cards)

---

-> Features

- Add products with name, price, quantity
- Mark products as expirable or shippable
- Add products to a shopping cart
- Checkout:
  - Shows subtotal, shipping fees, total paid, and remaining balance
- Sends shippable items to a ShippingService
- Shows errors for:
  - Empty cart
  - Insufficient balance
  - Expired or out-of-stock products

---

-> How to Run

1. Open the project in (NetBeans).
2. Make sure all `.java` files are inside the `src` folder.
3. Right-click the `Fawry.java` file and choose (Run File).
4. View the results in the Output Console.

---

-> Example Output

cart.add(cheese, 2);  
cart.add(tv, 3);  
cart.add(scratchCard, 1);  
checkout(customer, cart);

---
->️ Screenshots
[App Screenshot](Screenshot.png)



