package com.shopping;

public class Product {

    String product_name;
    int price;
    int quantity_available;

    public int getQuantity_available() {
        return quantity_available;
    }

    void order() {
        System.out.println("\n Order Placed");

    }

    public void setQuantity_available(int quantity_available) {
        this.quantity_available = quantity_available;
    }

    void changePrice() {
        System.out.println("\n Product Price Changed");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
