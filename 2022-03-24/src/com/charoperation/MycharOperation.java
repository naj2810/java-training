package com.charoperation;

public class MycharOperation {
    public char getCh() {
        return ch;
    }

    private char ch;

    public MycharOperation(char ch) {
        this.ch = ch;
    }

    boolean isVowel() {

        if (ch == 'a' || ch == 'A')
            return true;
        if (ch == 'e' || ch == 'E')
            return true;
        if (ch == 'e' || ch == 'E')
            return true;
        if (ch == 'i' || ch == 'I')
            return true;
        if (ch == 'o' || ch == 'O')
            return true;
        if (ch == 'u' || ch == 'U')
            return true;
        else {
            return false;
        }
    }
        boolean isConsonent()
        {
            if(isAlphabet() && !isVowel())
                        return true;
            else {
                return  false;
                }


    }
    public boolean isAlphabet()
    {
        if((ch>=97 && ch<=122)|| (ch>=65 && ch<=90))
            return true;
      
            return  false;
    }
    public boolean isDigit()
    {
        if(ch>=48 && ch<=57 )
            return true;
        else{
            return false;
        }

    }
    public void printLowerAlphabet()
    {
        for(ch='a';ch<='z';ch++)
        {
            System.out.println("\t"+ch);
        }
    }
    public void printUpperAlphabet()
    {
        for(ch='A';ch<='Z';ch++)
        {
            System.out.println("\t"+ch);
        }
    }
}
