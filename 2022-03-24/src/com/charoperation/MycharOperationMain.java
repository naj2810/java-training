package com.charoperation;

public class MycharOperationMain {
    public static void main(String args[])
    {
        MycharOperation m1= new MycharOperation('C');
        System.out.println("Entered charcter is "+m1.getCh());
        System.out.println("Character Is vowel :"+m1.isVowel());

        System.out.println("Character Is digit :"+m1.isDigit());
        System.out.println("Character Is Consonent :"+m1.isConsonent());
        System.out.println("Lower Aplpahabets are: \n ");
        m1.printLowerAlphabet();
        System.out.println("Upper Aplpahabets are: \n ");
        m1.printUpperAlphabet();;
    }
    }

