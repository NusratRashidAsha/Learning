package com.java.list7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> objectMap=new HashMap<>();
        objectMap.put("Organization", "Brac IT");
        objectMap.put("Department", "QA");
        objectMap.put("Name", "Nusrat");
        objectMap.put("Pin", "0780");
        System.out.println(objectMap);

        Map<String, Object> objectMap2=new HashMap<>();
        objectMap2.put("Organization", "Brac IT");
        objectMap2.put("Department", "QA");
        objectMap2.put("Name", "Nusrat");
        objectMap2.put("Pin", 780);
        objectMap2.put("objectMap", objectMap);

        System.out.println(objectMap2);
        System.out.println(objectMap2.get("Name"));

    }
}
