package com.PersinStringOP;

public class DayOfWeekString {
    public static void main(String[] args) {
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String daysMostChar="";
        System.out.println("\nWeek Days are:");
        for(String a:days)
        {
            System.out.println("\n"+a);
            if(a.length()>daysMostChar.length())
            {
            daysMostChar=a;
            }
        }
        System.out.println("\n Days with most no of character: "+daysMostChar);
        System.out.println("\n ");
        System.out.println("\n Reverse days of week are:");
        for(int i=days.length-1;i>=0;i--)
        {
            System.out.println("\n "+days[i]);
        }

    }
}
