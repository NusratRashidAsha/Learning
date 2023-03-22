package com.java.abstruction;

public class TestAbs {
public static void main(String[] args)
{
    MathClass refVariable;  //reference variable
    //refVariable.calculation();
    refVariable =new Addition();

    refVariable.calculation();
    refVariable.sum();

    Division refVariable2;  // reference variable 2
    refVariable2=new Division();
    refVariable2.multiplication();
    refVariable2.division();

    Remain referenceValue3;
    referenceValue3 =new RemainCalculation();
    referenceValue3.remaining();



   
}
}
