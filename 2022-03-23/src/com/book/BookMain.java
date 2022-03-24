package com.book;

public class BookMain {
    public static void main(String args[])
    {
        Book b1=new Book("Art Of Computer Programming");
        Book b2=new Book("Effective java");
        Book b3=new Book("Clean Code");
        String name=b1.getName();
        System.out.println("\n Information about Art Of Programming Books:");
        System.out.println("Name Of Book is"+name);
        b1.setPrice(200);
        b1.setAuthor("ABC");
        b1.setPages(200);
        System.out.println("Price:"+b1.getPrice());
        System.out.println("Author:"+b1.getAuthor());
        System.out.println("Pages:"+b1.getPages());
        System.out.println("\n Information about Effective Java Book:");
        System.out.println("Name Of Book is"+b2.getName());
        b2.setPrice(400);
        b2.setAuthor("XYZ");
        b2.setPages(300);
        System.out.println("Price:"+b2.getPrice());
        System.out.println("Author:"+b2.getAuthor());
        System.out.println("Pages:"+b2.getPages());
        System.out.println("\n Information about Clean Code Book:");
        System.out.println("Name Of Book is"+b3.getName());
        b3.setPrice(800);
        b3.setAuthor("PYZ");
        b3.setPages(800);
        System.out.println("Price:"+b3.getPrice());
        System.out.println("Author:"+b3.getAuthor());
        System.out.println("Pages:"+b3.getPages());

    }
}
