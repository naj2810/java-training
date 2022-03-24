package com.primitivedata;

import java.math.BigDecimal;

class BigDecimalSI
{
    public int getNoOfYears() {
        return noOfYears;
    }

    int noOfYears;
    private BigDecimal Principle,Interest;

    public BigDecimal getPrinciple() {
        return Principle;
    }

    public BigDecimal getInterest() {
        return Interest;
    }

    public  BigDecimalSI(String Principle, String Interest)
    {
        this.Principle=new BigDecimal(Principle);
        this.Interest=new BigDecimal(Interest);
    }

    public BigDecimal calculateValue(int noOfYears) {
      this.noOfYears=noOfYears;
        return Principle.add(Interest.multiply(new BigDecimal(noOfYears)));

    }
}

