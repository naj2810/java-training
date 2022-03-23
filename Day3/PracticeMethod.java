import java.lang.*;
import java.util.*;
class PracticeMethod{
    public static void main(String[] args) {
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