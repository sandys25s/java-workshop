package com.vetias.java.workshop.basics.collection;

import java.util.HashSet;
import java.util.Set;

public class Studentset {
    public static void main(String[] args) {
        Set<Integer> rollnos = new HashSet<Integer>();

        rollnos.add(1); 
        rollnos.add(2);
        rollnos.add(3);
        rollnos.add(4);
        rollnos.add(5);

        System.out.println("Set content: " + rollnos);
        System.out.println("Iterating through set:");
        for (Integer rollno : rollnos) {
            System.out.println(rollno);
        }
    }
}