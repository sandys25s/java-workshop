package com.vetias.java.workshop.Steam;

import java.util.List;
import java.util.ArrayList;

public class StreamExample {
        public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        long numberOfSubjectsPassed = marks.stream()
                                           .filter(mark -> mark > 30)
                                           .count();

        System.out.println(numberOfSubjectsPassed);
    }
}
