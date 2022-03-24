package com.shopping;

public class ShoppingCart {
    static int items;
    public int getItems() {
        return this.items;
    }

    public void setItems(int items) {
        this.items = items;
    }


    public void add(String item)
    {
        this.items=items;
        System.out.println(item+" is added into list");
    }
    public void remove(String item)
    {
        this.items=items;
        System.out.println(item+" is removed from list");
    }

}
