import java.lang.*;
import java.util.*;
class Practice2_Multipication
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=10;
        int b=12;
        int c=15;
        int d=20;
        if((a+b)>(c+d))
        {
            System.out.println(a+b);
        }
        else
        {
            System.out.println(c+d);
        }
        System.out.print("\n Enter number,whose table you want:");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("" + number + "*" + "" + i + "=" + (number * i));
        }

        System.out.print("\n square table upto 10 number");
        for (int i = 1; i <= 10; i++) {
            System.out.println(""+i + "=" +(i * i));
        }

    }

}