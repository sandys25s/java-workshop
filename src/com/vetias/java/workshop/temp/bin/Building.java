package com.vetias.java.workshop.temp.bin;

public class Building {
    private String name;
    private double area;
    private double floor;
    private double localdatetime;
    private double opendatetime;

    public void setName(String aname) {
        name = aname;
    }

    public String getName() {
        return name;
    }

    public void setArea(double aarea) {
        area = aarea;
    }

    public double getArea() {
        return area;
    }

    public void setFloor(double afloor) {
        floor = afloor;
    }

    public double getFloor() {
        return floor;
    }

    public double getLocaldatetime() {
        return localdatetime;
    }

    public void setLocaldatetime(double localdatetime) {
        this.localdatetime = localdatetime;
    }

    public double getOpendatetime() {
        return opendatetime;
    }

    public void setOpendatetime(double opendatetime) {
        this.opendatetime = opendatetime;
    }

    public void printDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printDetails'");
    }
}

