package com.vetias.java.workshop.Steam;

import java.util.Arrays;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks = { 70, 20, 90, 40, 80 };

        long numberOfSubjectsPassed = Arrays.stream(marks).filter(mark -> mark > 30).count();
        System.out.println( numberOfSubjectsPassed);

        numberOfSubjectsPassed = Arrays.stream(marks).filter(mark -> mark > 30).count();
        System.out.println( numberOfSubjectsPassed);
    }
}
