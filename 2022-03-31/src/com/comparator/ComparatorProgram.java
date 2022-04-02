package com.comparator;
import java.util.ArrayList;
import java.util.Comparator;

class AscOrderComparator implements Comparator<Student>
        {
public int compare(Student s1,Student s2)
{
    return Integer.compare(s1.getId(),s2.getId());
}
        }
public class ComparatorProgram {
    public static void main(String[] args) {
        Student s1 = new Student(24, "Narendra");
        Student s2 = new Student(26, "Shree");
        AscOrderComparator a1 = new AscOrderComparator();
        int c = a1.compare(s1, s2);
        if (c == 0) {
            System.out.println(" Student id's are Equal");
        }  else if (c>0) {
            System.out.println(" Student id 1 is greater than student2 id");
        }
        else {
            System.out.println(" Student id 2 is greater than student 1 id ");
        }

    }
}
