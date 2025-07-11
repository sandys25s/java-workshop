package com.vetias.java.workshop.Steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentListMerge {
    public static void main(String[] args) {
        List<Integer> csRollNo = Arrays.asList(1001, 1002, 1003, 1004, 1005);
        List<Integer> itRollNo = Arrays.asList(1006, 1007, 1008, 1009, 1010);
        List<Integer> aiRollNo = Arrays.asList(1011, 1012, 1013, 1014, 1015);

        List<Integer> allRollNo = Stream.concat(
            Stream.concat(csRollNo.stream(), itRollNo.stream()),
            aiRollNo.stream()
        ).collect(Collectors.toList());

        System.out.println(allRollNo);
    }
}