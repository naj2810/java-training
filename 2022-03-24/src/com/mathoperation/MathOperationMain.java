package com.mathoperation;
import java.util.*;
public class MathOperationMain {
    public static void main(String args[])
    {
        System.out.println("Enter value");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        MathOperation m1=new MathOperation(n);

        System.out.println("After adding  10, value of "+n+" become:" +m1.add(10));
        System.out.println("After multipication  3 ,value of "+n+" become: " +m1.multiply(3));
        System.out.println("Double value of "+n+"is  "+m1.doubleVal());
    }
}
