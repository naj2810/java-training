package com.Interface_Abstractexample;
 class Bird implements Flyble
{
    @Override
    public void fly() {
        System.out.println("Bird Fly with wings");
    }
}
 class Aeroplane implements Flyble
{
    @Override
    public void fly() {
        System.out.println("Aeroplane Fly with wings");
    }
}


public class InterfaceAbstractMain {
    public static void main(String[] args) {
        System.out.println("Interface Example");
        Flyble[] flyble={ new Bird(),new Aeroplane() };
        for(Flyble f: flyble)
        {
            f.fly();
        }
        //run time polymorphism and abstarct class example
        System.out.println("\n");
        System.out.println("Abstract Example");
        AbstractClass abstractClass=new Cat();
        abstractClass.bark();//cat bark called
        AbstractClass abstractClass1=new Dog();
        abstractClass1.bark();//dog bark called

    }

}
/*
public class Bird implements Flyble
{
    @Override
    public void fly() {
        System.out.println("Bird Fly with wings");
    }
}
 */