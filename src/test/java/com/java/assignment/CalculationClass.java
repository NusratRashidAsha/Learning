package com.java.assignment;

public class CalculationClass implements Calculable {
@Override
public void mul(int fValue, int lValue)
{
    System.out.println("The value of multiplication is: "+(fValue*lValue));
}
public static void main(String[] args)
{
    System.out.println(Calculable.message);
    Calculable value=new CalculationClass();
    value.add(30,20);
    value.mul(10,20);
    Calculable.mod(50, 30);







}


}
