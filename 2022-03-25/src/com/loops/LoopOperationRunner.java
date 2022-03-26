package com.loops;

public class LoopOperationRunner {
    public static void main(String[] args) {
        LoopOperation loop1=new LoopOperation(8);
        System.out.println("\n Number is : "+loop1.getNumber());
        System.out.println("\n Number is a prime : "+loop1.isPrime());
        System.out.println("\n Sum upto  "+loop1.getNumber()+" is: "+loop1.sumUptoN());
        System.out.println("\n Sum of divisior is: "+loop1.sumOfDivisior());
        System.out.println("\n Pattern Printing Using Loop: ");
        loop1.printTriangle();

    }
}
