package com.java.Information;

public class Person {

    String personName;
    int personAge;

    String personDesignation;
    int personId;

    void displayInformation(String personName, int personAge)
    {
        this.personName=personName;
        this.personAge=personAge;

        System.out.println("He is: "+personName);
        System.out.println("Age is: "+personAge);
    }


}
