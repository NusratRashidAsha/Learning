package com.java.assignment6;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

class ListTest {
    public static void main(String args[]) {
        //Creating a List
        List<String> list = new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Grapes");
        list.add("Orange");
        list.add("null");

        //Printing List element using for-each loop
        for (String fruit : list)   // for each loop
        {
            System.out.println(fruit);
        }
        System.out.println("--------------------------------------------------");

        System.out.println(list.get(3));  // search
        list.remove(4);    // remove Grapes
        list.add(2, "Peanut");  // Update




       for (int i=0; i <list.size(); i++ )
       {
           System.out.println(list.get(i));
       }

    }
}

