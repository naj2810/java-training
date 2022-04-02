package com.functionalProgramming;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FunctionalProgramming {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
List<String> list=List.of("Narendra","Ganesh","Suresh","Lion","Tiger","Mahesh");
List<Integer> list1=List.of(12,13,15,67,154,78,89,99,76);

System.out.println("string list");
   printWIthFp(list);
   printFiltering(list);

        System.out.println("Integer List");
   printWIthFp(list1);
   printEvenOddWithFP(list1);
        System.out.println("Sum of Integer using Functional Programming is"+sumFp(list1));
        System.out.println("Sorted function in functional programming ,for integer");
        list1.stream().sorted().forEach(e->System.out.println(e));
        System.out.println("Sorted function in functional programming ,for String");
        list.stream().sorted().forEach(e->System.out.println(e));
        System.out.println("Calculate size of each of word in string array");
        getSize(list);
        System.out.println("Converting lowercase ,to each word of string arraylist");
        lowercase(list);
        System.out.println("Enter the range from to ,to print square number");
        int from= sc.nextInt();
        int to=sc.nextInt();
        IntStream.range(from,to).map(e1->e1*e1).forEach(p-> System.out.println(p));

    }
    public static void printWIthFp(List list)
    {
        list.stream().forEach(e-> System.out.println("element:"+e));

    }

    public static void printFiltering(List<String> list)
    {
        list.stream().filter(
                e1->e1.endsWith("sh")

        )
                .forEach(
                        e1-> System.out.println("The Names ,which ends with sh:"+e1)
        );

    }

    public static void printEvenOddWithFP(List<Integer> listI)
    {
        listI.stream().filter(e->e%2==0).forEach(e2-> System.out.println("Even Number:"+e2));
        listI.stream().filter(e->e%2!=0).forEach(e1-> System.out.println("Odd  Number:"+e1));

    }
    public static int sumFp(List<Integer> list1) {

            int sum = list1.stream().reduce(0,(number1,number2)->number1+number2);
      return  sum;
    }
    public static void getSize(List<String> l1)
    {
        l1.stream().map(s -> s.length()).forEach(e-> System.out.println(e));
    }
    public static void lowercase(List<String> l1)
    {
        l1.stream().map(s->s.toLowerCase()).forEach(e->System.out.println(e));
    }
}
