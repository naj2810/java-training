package com.shopping;

public class Customer {
    String name;
    String address;
    void login(String name)
    {
        System.out.println(name+" Logged in");

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void logout()
    {
        System.out.println(name+" Logged out");
    }
    void selectProduct(String product)
    {
        System.out.println("\n Selected Product is:"+product);
    }
}
