package com.vetias.java.workshop.basics.collection;

import java.util.ArrayList;
import java.util.List;

public class Listexample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); // Corrected type

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        list.add("Collections");

        System.out.println("names");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}