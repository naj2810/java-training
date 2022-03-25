package com.whileloopOp;
import java.util.*;
public class WhileLoopEx {
    public static void main(String[] args) {
        System.out.println("\n Enter a number   ,do you want to print square and cubes upto that number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        squareUpto(n);
        cubeUpto(n);

    }
    public static void squareUpto(int number1)
    {
        int i=1;
        int square=0;
        System.out.println("\n The Squares Upto "+number1+" are:");
        while (i<=number1)
        {
            System.out.println("\n "+i+"10: "+(i*i));
            i++;
        }

    }
    public static void cubeUpto(int number1)
    {
        int i=1;
        int square=0;
        System.out.println("\n Cube upto number"+number1);
        while (i<=number1)
        {
            System.out.println("\n  "+i+" : "+(i*i*i));
            i++;
        }

    }
}
