package com.java.Polymorphysm;

public class Triangle extends Shape{

    double baseOfTriangle;
    double heightOfTriangle;

    Triangle(double base, double height)
    {
       baseOfTriangle=base;
        heightOfTriangle=height;

    }
    @Override
    double area()
    {
        return 0.5*baseOfTriangle*heightOfTriangle;

    }
}
