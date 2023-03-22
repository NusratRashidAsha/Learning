package com.java.Information;

public class Teacher extends Person{     // single

    String qualification;

    void displayDesignationAndId()  //inherit personid, qualifications, person designtion from parent person
    {
        System.out.println("He is a: "+personDesignation);
        System.out.println("He has done Phd in: "+qualification);
        System.out.println("And ID is: "+personId);
        System.out.println();

    }

}
