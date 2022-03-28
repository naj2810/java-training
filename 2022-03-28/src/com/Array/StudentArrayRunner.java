package com.Array;

public class StudentArrayRunner {
    public static void main(String[] args) {

        int mark[]={75,25};
       Student student=new Student("Raj",mark);
        System.out.println("\n The Name Of Student is "+student.getName());
        System.out.println("\n Total No. Of Marks Entered "+student.getCount());
        System.out.println("\n Student data:"+student.toString());
        System.out.println("\n The Minimum Mark get to student "+student.getName()+" is "+student.minimumMark());
        System.out.println("\n The Maximum Mark get to student "+student.getName()+" is "+student.maximumMark());

        System.out.println("\n The Avarage of Mark is "+student.getName()+" is "+student.avarage_Mark());

        int mark1[]={92,97,56,40,56};

        Student student1=new Student("Ajay",mark1);
        System.out.println("\n");
        System.out.println("\n The Name Of Student is "+student1.getName());
        System.out.println("\n Total No. Of Marks Entered "+student1.getCount());
        System.out.println("\n The Minimum Mark get to student "+student1.getName()+" is "+student1.minimumMark());
        System.out.println("\n Student data:"+student.toString());
        System.out.println("\n The Maximum Mark get to student "+student1.getName()+" is "+student1.maximumMark());
        System.out.println("\n The Avarage of Mark is "+student1.getName()+" is "+student1.avarage_Mark());


    }
}
