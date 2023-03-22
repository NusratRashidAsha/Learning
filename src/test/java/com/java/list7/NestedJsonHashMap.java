package com.java.list7;


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class NestedJsonHashMap {
    public static void main(String[] args) {
        List<String> listClass=new ArrayList<>();
        listClass.add("Class");
        listClass.add("Interface");
        listClass.add("AbstractClass");


        Map<String, Object> hobby=new HashMap<>();
        hobby.put("Reading", true);
        hobby.put("Gaming", false);
        hobby.put("Sport", "Football");


        Map<String, Object> information=new HashMap<>();
        information.put("Name", "Nusrat");
        information.put("Pin", 1780);
        information.put("hobby", hobby);
        information.put("Learning", listClass);

        System.out.println(information);

    }
}
