package shopping_cart;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String itemName;
        double itemUnitPrice;
        int itemQuantity;
        double totalPrice = 0.0;
        double grandTotal = 0.0;
        boolean continueShopping = true;
        String yesNo = "";
        ArrayList<Item> items = new ArrayList<Item>();

        while (continueShopping) {
            System.out.print("Enter the name of the item: ");
            itemName = input.next();
            System.out.print("Enter the unit price: ");
            itemUnitPrice = input.nextDouble();
            System.out.print("Enter the quantity: ");
            itemQuantity = input.nextInt();
            items.add(new Item(itemName, itemUnitPrice, itemQuantity));
            System.out.println("Current Cart");
            for (Item item : items) {
                System.out.println("Item: " + item.getName() + "               Price: " + item.getPrice() + "      Quantity: " + item.getQuantity());
                totalPrice = item.getPrice() * item.getQuantity();
            }

            grandTotal += totalPrice;
            System.out.println("Total Price: " + grandTotal);
            System.out.println("\n" + "Continue shopping (y/n?) ");
            yesNo = input.next().toLowerCase();
            if (yesNo.equals("n")) {
                continueShopping = false;

            }
        }
    }
}

