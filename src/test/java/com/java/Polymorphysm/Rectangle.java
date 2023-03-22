package com.java.Polymorphysm;

public class Rectangle extends Shape{

    double lengthOfRectangle;
    double widthOfRectangle;


    Rectangle(double lengthOfRectangle, double widthOfRectangle)
    {
        this.lengthOfRectangle=lengthOfRectangle;
        this.widthOfRectangle=widthOfRectangle;
    }


    @Override
    double area()
    {
        double areaOfRectangle;
        areaOfRectangle=lengthOfRectangle*widthOfRectangle;
        return areaOfRectangle;
       // System.out.println("");
    }

}
