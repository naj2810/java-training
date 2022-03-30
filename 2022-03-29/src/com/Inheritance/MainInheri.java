package com.Inheritance;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainInheri {
    public static void main(String[] args) {

        System.out.println("Enter Person Details .....");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Name:");
        String name=scanner.next();

        System.out.println("Enter Phone Number:");
        String phone_no=scanner.next();

        System.out.println("Enter email:");
        String email=scanner.next();

        System.out.println("Enter Id");
        char id=scanner.next().charAt(0);

        System.out.println("Enter Adress");
        String adress= scanner.next();

        System.out.println("Enter Grade");
        char grade=scanner.next().charAt(0);

        System.out.println("Enter Salary");
        int sal=scanner.nextInt();
        BigDecimal salary=new BigDecimal( sal);


        Employee employee=new Employee();
        employee.setName(name);//Parent class method
        employee.setId(id);//parentclass method
        employee.setEmail(email);//parent
        employee.setPhone_no(phone_no);
        employee.setName(name);
        employee.setGrade(grade);
        employee.setAdress(adress);
        employee.setSalary(salary);

            System.out.println("Name Of Person is" + employee.getName());
            System.out.println("Id of Employee" + employee.getId());
            System.out.println("\n email of Person is" + employee.getEmail());
            System.out.println("Phone Number Of Person" + employee.getPhone_no());


            System.out.println("Adress of employee " + employee.getAdress());
            System.out.println("Grade of employee " + employee.getGrade());
            System.out.println("Salary of employee " + employee.getSalary());

            System.out.println("Display data in string format " + employee.toStringE());

    }
}
