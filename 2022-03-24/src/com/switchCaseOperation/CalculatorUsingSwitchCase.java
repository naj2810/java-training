package com.switchCaseOperation;
import java.util.*;
public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers");
        System.out.println("Enter First Number");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int number2 = scanner.nextInt();
        System.out.println("Operations Menu");


            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multipication");
            System.out.println("4.Division");

        System.out.println("\n Enter Your choice");
        int choice = scanner.nextInt();




        int result=0;
        switch (choice){
            case 1:result=number1+number2;
                System.out.println("Addition Of Two Numbers are"+result);
                break;
            case 2:result=number1-number2;
                System.out.println("Substraction Of Two Numbers are"+result);
                break;
            case 3:result=number1*number2;
                System.out.println("Multipication Of Two Numbers are"+result);
                break;
            case 4:result=number1/number2;
                System.out.println("Division Of Two Numbers are"+result);
                break;
            default:
                System.out.println("Invalid Choice");
        }




    }
    }

