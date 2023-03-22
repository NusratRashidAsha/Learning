package com.java.assignment6;

public class TestNonGeneric {

    public static void main(String[] args)
    {
        IntegerType takeInteger=new IntegerType(200);
        System.out.println("The Integer value is: "+(takeInteger.getValue()));


        StringType StringInteger= new StringType("Alphabet");

        System.out.println("The String value is: "+(StringInteger.getValue()));


        DoubleType takeDouble=new DoubleType(666.66);

        System.out.println("The Double value is: "+(takeDouble.getValue()));

    }
}
