import java.lang.*;
import java.util.*;
class Practice2
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=10;
        int b=12;
        int c=15;
        int d=20;
        //compare (a+b) and(c+d) and print the greatest value
        if((a+b)>(c+d))
        {
            System.out.println(a+b);
        }
        else
        {
            System.out.println(c+d);
        }
        //Check given angles are ,triangle or not
        int angle1=20;
        int angle2=90;
        int angle3=70;
        if(angle1+angle2+angle3==180)
        {
            System.out.println(" Triangle");
        }
        else {
            System.out.println("Not Triangle");
        }
        //check even number or odd number
        int number=25;
        if(number%2==0)
        {
            System.out.println(""+number+"is even");
        }
        else{
            System.out.println(""+number+"is odd");
        }

        }

    }

