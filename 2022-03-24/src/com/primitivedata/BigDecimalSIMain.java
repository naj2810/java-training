package com.primitivedata;

public class BigDecimalSIMain {
    public static void main(String args[])
    {
        BigDecimalSI b1=new BigDecimalSI("2000.56","5");
        b1.calculateValue(5);
        System.out.println("The Simple Interest of Principal "+b1.getPrinciple()+" and interest "+b1.getInterest()+"% for year "+b1.noOfYears+" is "+b1.calculateValue(10));
    }
}
