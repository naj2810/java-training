package com.shopping;
public class ShoppingSystem {
    public static void main(String args[])
    {
        System.out.println("\n ***************Customer Class Operations***********************");

        Customer c1=new Customer();
        c1.setName("Ajay");
        c1.setName("Rahul");
        String Name=c1.getName();
        c1.login(Name);
        c1.logout();
        c1.selectProduct("Cloths");

        System.out.println("\n ******************Product Class Operation********************");

        Product p1=new Product();
        p1.setPrice(100);
        p1.getPrice();
        p1.changePrice();
        p1.setQuantity_available(300);
        int quantity=p1.getQuantity_available();
        System.out.println("\n Quantity available:-"+quantity);
        p1.order();

        System.out.println("\n********************** Shopping Cart Operation********************");

        ShoppingCart sc=new ShoppingCart();
        sc.add("Towel");
        sc.add("Rice");
        sc.remove("Towel");
    }
}
