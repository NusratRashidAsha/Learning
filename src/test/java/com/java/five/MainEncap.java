package com.java.five;

public class MainEncap {

    public static void main(String[] args)
    {
        Employee setObj=new Employee();
        setObj.setName("Nusrat");  //no get operation
        setObj.setIdNum("3");
     //   System.out.println("Name is: "+setObj.);

        Department getObj=new Department();
        System.out.println("The department is: "+getObj.getDepartmentName());// no set operation
        System.out.println("The Id is: "+getObj.getAge());

        QaDepartment setGet = new QaDepartment();
        setGet.setDesignation("QA");
        setGet.setWorkingYear(3);
        System.out.println("His designation is: "+setGet.getDesignation());
        System.out.println("His designation is: "+setGet.getWorkingYear());


    }
}
