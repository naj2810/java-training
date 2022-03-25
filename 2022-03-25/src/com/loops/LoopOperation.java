package com.loops;

public class LoopOperation {
    public int number;

    public int getNumber() {
        return number;
    }

    LoopOperation(int number)
    {
        this.number=number;

    }
    boolean isPrime()
    {
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
                return  false;
        }
        return true;
    }
    int sumUptoN()
    {
        int sum=0;
    for(int i=1;i<=number;i++)
    {
         sum+=i;

    }
    return sum;

      }
      int sumOfDivisior()
      {
          int sumOfDiv=0;
          if(number>1)
          {
              for( int i=2;i<number;i++)
              {
                  if(number%i==0)
                  {
                      sumOfDiv+=i;
                  }
              }
              return sumOfDiv;
          }
          return  0;
      }

      void printTriangle()
      {
          for(int i=1;i<=number;i++)
          {
              for(int j=0;j<i;j++)
              {
                  System.out.print(""+j);
              }
              System.out.println("");
          }
      }

}

