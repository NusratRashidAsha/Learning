package com.java.assignment;

public interface Calculable {


    static final String message="This is an Interface Example";

    public abstract void mul(int fValue, int lValue);   // abstraction


    public default void add(int fValue, int lValue)    //default method
    {
        sum(fValue, lValue);           // accessing private method
        System.out.print("accessing a private sum method and the value is : ");
        System.out.println(fValue+lValue);
    }

    public static void mod(int fValue, int lValue)   //static method
    {
        System.out.println("The Mod value is: "+fValue % lValue);
    }

    private void sub(int fValue, int lValue)  // Private method
    {
        System.out.println("The subtraction value is : " +(fValue - lValue));
    }

    private void sum(int fValue, int lValue)  // Private method
    {
        System.out.print("This summation printing from private method: ");
        System.out.println(fValue + lValue);
    }

    private static void div(int fValue, int lValue)
    {

        System.out.println(fValue / lValue);
    }

}
