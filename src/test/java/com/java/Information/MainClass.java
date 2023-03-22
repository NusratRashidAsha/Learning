package com.java.Information;

public class MainClass extends Teacher{    // multilevel

public static void main(String[] args)
{
    Person displayInfo=new Person();
    displayInfo.displayInformation("Rohim",45 );

   Teacher display=new Teacher();

   display.personDesignation="Teacher";
    display.qualification="Computer Science";
   display.personId= 0012;
   display.displayDesignationAndId();



   Student studentInfo=new Student();
   studentInfo.displayInformation("Nabila", 30);
}
}
