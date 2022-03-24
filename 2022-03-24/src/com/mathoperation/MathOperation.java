package com.mathoperation;

public class MathOperation {
    int number;
    MathOperation(int number)
    {
        this.number=number;
    }
    public int add(int number1)
    {
        return this.number+number1;
    }
    public int multiply(int number1)
    {
        return this.number*number1;
    }
    public int doubleVal()
    {
        return number*=2;

    }
}
