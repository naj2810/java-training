package com.Inheritance;

import java.math.BigDecimal;

public class Employee extends Person {

    int id;
   char grade;



    String adress;
    BigDecimal salary;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }



    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
 String toStringE()
 {
     return String.format("Id- %d Name- %s Grade- %s Salary %.2f",id,getName(),grade,salary);

 }




}
