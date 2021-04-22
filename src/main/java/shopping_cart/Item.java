package shopping_cart;

import java.util.ArrayList;
import java.util.List;

public class Item {
    /*Create an Item class that models an Item to be purchased. It should contain instance data
    and a constructor to hold the following characteristics: name, price and quantity.
    Item class should also include accessor methods for the 3 characteristics and a toString summary.*/

    List<Item> myItem = new ArrayList<>();

        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;

        }
        public String getName(){
            return this.name;
        }

        public double getPrice() {
            return this.price;
        }
        public int getQuantity() {
            return this.quantity;
    }

}
