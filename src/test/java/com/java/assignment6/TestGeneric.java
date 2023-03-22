package com.java.assignment6;

public class TestGeneric {

    public static void main(String[] args) {

       Generic<String> type = new Generic(50);
        type.setValue("Passing String Value: abcd");
        System.out.println(type.getValue());

        Generic<Integer> intType =new Generic(10);
        intType.setValue(66);
        intType.setValue(100);
        System.out.println("Passing Integer value: "+intType.getValue());

    }
}
