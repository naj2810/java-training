package com.person;

public class PersonMain {
    public static void main(String args[])
    {
        Person p1=new Person();
        Person p2=new Person();

        p1.setName("Ajay");
        p1.setAddress("Pune");
        p1.setHobbies("Playing Cricket");
        System.out.println("\n Address Of this Person is"+p1.getAddress());
        System.out.println("\n Hobbies Of this Person is"+p1.getHobbies());
        p1.walk();
        p1.eat();
        p1.sleep();
        p2.setName("Rahul");
        p2.setAddress("Mumabai");
        p2.setHobbies("Playing Chess");
        System.out.println("\n Address Of this Person is"+p2.getAddress());
        System.out.println("\n Hobbies Of this Person is"+p2.getHobbies());
        p2.walk();
        p2.eat();
        p2.sleep();

    }
}

