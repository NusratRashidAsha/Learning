package com.java.list7;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {


        Set<String> setString =new HashSet<String>();
        setString.add("Rohim");
        setString.add("Korim");
        setString.add("Nila");
        setString.add("Nila");
        setString.add("piyash");
        setString.add("");
        setString.add("null");
        setString.add("null");
        setString.add("");

        setString.remove("Nila");
        setString.add("Rokeya");

        for (String s: setString)
        {
            System.out.println(s);
        }

    }
}
