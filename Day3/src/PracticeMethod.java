import java.lang.*;
import java.util.*;
class PracticeMethod{
    public static void main(String[] args) {

        //print 6 & 10 Table
        System.out.println("6 Table");
        for(int i=1;i<=10;i++)
        {
            System.out.println("6*"+i+"="+(6*i));
        }
        System.out.println("\n");
        System.out.println("10 Table");
        for(int i=1;i<=10;i++)
        {
            System.out.println("10*"+i+"="+(10*i));
        }
        //print numbers 1 to 10
        System.out.println("\n");
        System.out.println( "1 to 10 number:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(""+i);
        }
        //print numbers 10 to 1
        System.out.println("\n");
        System.out.println("Reverse Number 10 to 1");

        for(int i=10;i>=1;i--)
        {
            System.out.println(""+i);
        }
        //square of first 10 numbers
        System.out.println("\n");
        System.out.println("Square  Number 1 to 10");
        for(int i=1;i<=10;i++)
        {
            System.out.println("\n "+i+":"+(i*i));
        }
        //square of even and odd number
        System.out.println("\n");
        System.out.println("Square Of Even Number:");
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
                System.out.println(+i+":"+(i*i));

        }
        System.out.println("\n");
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
                System.out.println("Square Of Odd Number:"+i+":"+(i*i));

        }
        //methods
        //print 1 to n
        int n=10;
        printnumbers( n);

        System.out.println("\n");

        System.out.println("\n Enter the two number,that you want to compare");
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println("Max:"+max(number1,number2));
        System.out.println("Min:"+min(number1,number2));
        System.out.println("\n Enter the Hour,that you want to convert into minute and second:");
        float hr=sc.nextFloat();
        convertMinSec(hr);

    }
    static void printnumbers(int a)
    {
        for(int i=0;i<a;i++)
        {
            System.out.println(""+i);
        }
    }
    static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
       else{
           return b;
        }
    }
    static int min(int a,int b)
    {
        if(a<b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    static void convertMinSec(float h){
        float minute=60*h;
        System.out.println("Minutes:"+minute);
        float second=3600*h;
        System.out.println("Seconds:"+second);


    }


}