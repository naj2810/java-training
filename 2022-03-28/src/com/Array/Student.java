package com.Array;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    String name;



    int mark[];
   public Student(String name,int... mark) //variable argument
    {
        this.name=name;
        this.mark=mark;
    }

    public int maximumMark()
    {
        int maximum=Integer.MIN_VALUE;
        for(int marks:mark) //Enhanced For Loop
        {
            if(marks>maximum)
            {
                maximum=marks;
            }
        }

        return maximum;
    }
    public int minimumMark()
    {
        int minimum=Integer.MAX_VALUE;
        for(int marks:mark)
        {
            if(marks<minimum)
            {
                minimum=marks;
            }
        }
        return minimum;
    }

    public String getName() {
        return name;
    }


    public int getSumOfMark()
    {
        int sum=0;
        for(int m:mark)
        {
            sum+=m;
        }
        return sum;
    }
    public BigDecimal avarage_Mark()
    {
        int totalsum=getSumOfMark();
        int total=getCount();
        return new BigDecimal(totalsum).divide(new BigDecimal(total),3, RoundingMode.UP);
    }
    public int getCount()
    {
        return mark.length;
    }



}
