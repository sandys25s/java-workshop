package com.vetias.java.workshop.temp.bin;

public class Floor {
    private String name;
    private int number;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println()
    }
 
}
