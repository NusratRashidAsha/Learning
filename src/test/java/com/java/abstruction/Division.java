package com.java.abstruction;

public class Division extends Multiply{  //inherit multiply class with all abstract method.

    @Override
     void multiplication()
    {
       int value1=10;
       int value2=10;
       int valueOfMultiplication=value1*value2;
        System.out.println("The of Multiplication is : "+valueOfMultiplication);

    }

    void division()
    {
       int num1=30;
       int num2 = 15;
       int valueOfDivision=num1/num2;
       System.out.println("The Division Value is: "+valueOfDivision);
    }
}
