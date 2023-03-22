package com.java.AssignmentOfModifire;

public class SecondClass {

    public int class_number;   // public modifire
   // int class_number;


// in this class i used public modifire(as variable) and Methods: Non return, Return, without Parameter, Parameter

public void displayClassNumber()     // non returntype
{
    System.out.println("This is a public modifire");
    System.out.println("Assignment number: "+class_number);
}

public int returnType(int a, int b)     // return type int with perameter
{
    int z=a+b;
    return z;
}

public int withoutperameter()   //   return type without perameter
{
    int num1 = 40;
    int num2 = 50;
    int add=num1+num2;

    return add;
}

}
