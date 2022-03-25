package com.dowhileloopmenu;

import java.util.*;
public class DoWhileLoop {
    public static void main(String[] args) {
        int ch;
        int num=-1;
        Scanner scanner = new Scanner(System.in);
       do {
           if(num!=-1)
           {
               System.out.println("Cube is "+(num*num*num));
               System.out.println("\n Enter -1 for exit");
           }
           System.out.println("\n Enter Number :");
           num= scanner.nextInt();


       }while(num>=0);
        System.out.println("\n Thank you!");

    }
}
