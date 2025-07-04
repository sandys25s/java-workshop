package com.vetias.java.workshop.temp.bin;

public class Zones {
    private String name
    private double zone id;
    private String type;
    private double area;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getZone() {
        return zone;
    }
    public void setZone(double zone) {
        this.zone = zone;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Zone Name: " + name);
        System.out.println("Zone ID: " + zone);
        System.out.println("Zone Type: " + type);
        System.out.println("Zone Area: " + area);
    }
    }