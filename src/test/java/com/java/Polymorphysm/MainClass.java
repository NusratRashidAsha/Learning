package com.java.Polymorphysm;

public class MainClass {

public static void main(String[] args)
{
 Rectangle areaOfRec=new Rectangle(12, 11);
 Triangle areaOfTri=new Triangle(11,15);


 System.out.println("The area of Rectangle is: "+areaOfRec.area());
 System.out.println("The area of Triangle is: "+areaOfTri.area());
}
}
