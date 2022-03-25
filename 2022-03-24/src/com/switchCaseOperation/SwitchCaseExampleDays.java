package com.switchCaseOperation;
import java.util.*;
public class SwitchCaseExampleDays {
    public static void main(String[] args) {
        System.out.println("\n Enter number you want to print day");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println("Day is " + determineDayFromNumber(day));
        System.out.println("Enter number to  check  is it  a weekday or not");
        int days = scanner.nextInt();
        System.out.println("is it weekDay " + weekDay(days));
        System.out.println("Enter Number to find month from the number");
        int month = scanner.nextInt();
        System.out.println("month is " + getMonthFromNumber(month));


    }

    public static String determineDayFromNumber(int day) {
        if (day > 0 && day <= 6)
            switch (day) {
                case 0:
                    return "Sunday";
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednsday";
                case 4:
                    return "Thrusday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                default:
                    return "invalid choice";
            }
        return null;
    }

    public static boolean weekDay(int Day) {
        if(Day>=0 &&Day<7)

        if (Day== 0 || Day == 6)
            return true;

            return false;

    }

    public static String getMonthFromNumber(int m) {
        switch (m) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "Augast";
            case 9:
                return "September";
            case 10:
                return "Octomber";
            case 11:
                return "November";
            case 12:
                return "Decemeber";
            default:
            return null;
        }

    }
}




