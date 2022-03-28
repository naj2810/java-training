package com.ArrayList;




import java.util.ArrayList;

public class StudentArrayListRunner {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<Integer>();

        StudentArraylist student=new StudentArraylist("Raj", 97,98,99,100);

        System.out.println("\n Student Info:"+student.toString());
        System.out.println("\n Total No. Of Marks Entered "+student.getCount());

        System.out.println("\n The Minimum Mark get to student "+student.getName()+" is "+student.minimumMark());
        System.out.println("\n The Maximum Mark get to student "+student.getName()+" is "+student.maximumMark());

        System.out.println("\n The Avarage of Mark is "+student.getName()+" is "+student.avarage_Mark());

        int mark1[]={92,97,56,40,35,69,85};

        StudentArraylist student1=new StudentArraylist("Ajay",mark1);
        System.out.println("\n");
        System.out.println("\n Student Info:"+student1.toString());
        System.out.println("\n Total No. Of Marks Entered "+student1.getCount());

        System.out.println("\n The Minimum Mark get to student "+student1.getName()+" is "+student1.minimumMark());
        System.out.println("\n The Maximum Mark get to student "+student1.getName()+" is "+student1.maximumMark());
        System.out.println("\n The Avarage of Mark is "+student1.getName()+" is "+student1.avarage_Mark());

    }
}
