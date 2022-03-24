package com.person;

public class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    String address;
    String hobbies;
    String work;
    void walk()
    {
        System.out.println("\n This Person is Walking:"+getName());
    }
    void run()
    {
        System.out.println("\n This Person Running:"+getName());
    }
    void sleep()
    {
        System.out.println("\n This person Sleeping:"+getName());
    }
    void eat(){
        System.out.println("\n This person is Eating:"+getName());
    }
    void drink()
    {
        System.out.println("\nThis person is Drinking:"+getName());
    }





}
