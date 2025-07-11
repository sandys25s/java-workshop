package com.vetias.java.workshop.Steam;

import java.util.ArrayList;
import java.util.List;

public class NameStartsWithCount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("shahul");
        names.add("reshma");
        names.add("zameer");
        names.add("iman");
        names.add("santhosh");
        names.add("nowfiya");

        names.stream()
             .filter(name -> name.startsWith("s"))
             .map(String::toUpperCase)
             .forEach(System.out::println);
        names.stream().distinct().map(String::toUpperCase).forEach(System.out::println);

    }
}