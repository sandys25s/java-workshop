package com.vetias.java.workshop.basics.collection;

import java.util.*;

public class MarkList {
    public static void main(String[] args) {
        
        List<Integer> marks = Arrays.asList(85, 67, 92, 76, 89, 58, 73);

        
        List<Integer> ascending = new ArrayList<>(marks);
        Collections.sort(ascending);
        System.out.println("Ascending order: " + ascending);

        
        List<Integer> descending = new ArrayList<>(marks);
        Collections.sort(descending, Collections.reverseOrder());
        System.out.println("Descending order: " + descending);
    }
}
