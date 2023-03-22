package com.java.Operators;

public class BasicClass {
    public static void main(String[] args)
    {
        int value= 50;

        System.out.println("the value is "+ ++value);    //unary operator
        System.out.println("the value is "+ value--);
        System.out.println("the value is "+ value++);
        System.out.println("the value is "+ --value);
        System.out.println("----------------------------------------");

        int i = 37;      // Primitive data types
        float j = 42;
        double x = 27.475;
        double y = 7.22;
        // Arithmetic Operator
        System.out.println("    i + j = " + (i + j));  //add
        System.out.println("    i - j = " + (i - j)); //subtraction
        System.out.println("    i * j = " + (i * j)); // multiplication
        System.out.println("    i / j = " + (i / j)); // devide
        System.out.println("    i % j = " + (i % j)); // reminder value
        System.out.println("----------------------------------------");

        //Ternary Operator

        int num1=30, num2= 50;
        int maxnum=(num1 > num2) ? num1:num2;
        System.out.println("The max number is: "+maxnum);
        System.out.println("----------------------------------------");

        // Relational Operato
        System.out.println("num1 > num2 "+ (num1 > num2));
        System.out.println("num1 < num2 "+ (num1 < num2));
        System.out.println("num1 >= num2 "+ (num1 >= num2));
        System.out.println("num1 <= num2 "+ (num1 <= num2));
        System.out.println("num1 == num2 "+ (num1 >= num2));
        System.out.println("num1 != num2 "+ (num1 <= num2));
        System.out.println("----------------------------------------");

        //conditional operator
        System.out.println((num1 > num2) && (num1 >= num2));
        System.out.println((num1 < num2) && (num1 >= num2));
        System.out.println((num1 < num2) || (num1 >= num2));



    }



}
