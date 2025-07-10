package com.vetias.java.workshop.basics.collection;

import java.util.Map;
import java.util.HashMap;

public class studentMap {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "John Doe");
        studentMap.put(2, "Jane Smith");
        studentMap.put(3, "Alice Johnson");
        studentMap.put(4, "Bob Brown");
        studentMap.put(5, "Charlie White");

        System.out.println("Student Map:");


        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}