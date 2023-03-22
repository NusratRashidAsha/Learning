package com.java.Convention;

public class Naming {
    // create a method
    public int addNumbers(int fName, int lName) {
        int value = fName + lName;
        // return value
        return value;
    }

    public int subtraction(int fName, int lName) {
        int value = fName - lName;
        // return value
        return value;
    }

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 15;

        // create an object of Main
        Naming Conven = new Naming();
        // calling method
        int result = Conven.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);

        int subtractionResult;
        subtractionResult=Conven.subtraction(num1, num2);
        System.out.println("The subtraction is: " + subtractionResult);
    }
}
