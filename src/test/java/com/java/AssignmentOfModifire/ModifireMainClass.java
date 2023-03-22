package com.java.AssignmentOfModifire;

public class ModifireMainClass {

    public static void main(String[] args)
    {
        FirstClass obj = new FirstClass();
        obj.setName("print Java private Modifire");
        System.out.println(obj.getName());

        System.out.println("---------------------------------");

        SecondClass return1= new SecondClass();
        int sum=return1.returnType(30, 20);
       // return1.returnType(30, 20);
        System.out.println("the return value is: "+sum);

        System.out.println("---------------------------------");

        SecondClass without =new SecondClass();
        int add=without.withoutperameter();
        System.out.println("this is a without perameter method and sum is: "+add);





    }


}
