package com.vetias.java.workshop.temp.bin;

public class Zones {
    private String name;
    private double zoneId;
    private String type;
    private double area;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getZoneId() {
        return zoneId;
    }
    public void setZoneId(double zoneId) {
        this.zoneId = zoneId;
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
    public static void printDetails(Zones zones) {
        System.out.println("Zone Name: " + zones.name);
        System.out.println("Zone ID: " + zones.zoneId);
        System.out.println("Zone Type: " + zones.type);
        System.out.println("Zone Area: " + zones.area);
    }
}