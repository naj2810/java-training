package com.ArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class StudentArraylist {
        String name;
        ArrayList<Integer> marks=new ArrayList<Integer>();

       public StudentArraylist(String name,int... marks)
        {
            this.name=name;
            for (int mark:marks)
            {
                this.marks.add(mark);
            }

        }
    public int maximumMark()
    {
        int maximum=Integer.MIN_VALUE;
        for(int mark:marks) //Enhanced For Loop
        {
            if(mark>maximum)
            {
                maximum=mark;
            }
        }

        return maximum;
    }
    public int minimumMark()
    {
        int minimum=Integer.MAX_VALUE;
        for(int mark:marks)
        {
            if(mark<minimum)
            {
                minimum=mark;
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
        for(int m:marks)
        {
            sum+=m;
        }
        return sum;
    }
    public BigDecimal avarage_Mark()
    {
        int totalsum=getSumOfMark();
        int total=marks.size();
        return new BigDecimal(totalsum).divide(new BigDecimal(total),3, RoundingMode.UP);
    }
    public int getCount()
    {
        return marks.size();
    }
    public void addMark(int a)
    {
        marks.add(a);
    }
    public void removeMarkatIndex(int index)
    {
        marks.remove(index);
    }

    @Override
    public String toString() {
        return "StudentArraylist{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
