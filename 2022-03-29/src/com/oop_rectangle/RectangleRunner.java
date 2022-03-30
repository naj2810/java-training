package com.oop_rectangle;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n Enter Length Of Rectangle");
        int length=scanner.nextInt();
        System.out.println("\n Enter width Of Rectangle ");
        int width=scanner.nextInt();
        Rectangle rectangle=new Rectangle(length,width);
        System.out.println(""+rectangle.toStringF());


        /*System.out.println("Area of Rectagle is:"+ rectangle.area());
        System.out.println("Perimeter of Rectangle is" +rectangle.perimeter());*/
    }


}
