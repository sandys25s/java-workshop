package com.vetias.java.workshop.temp;

public class Temperaturesensor implements Sensor{
    private float temperature;
    
    public Temperaturesensor(float atemperature) {
        temperature = atemperature;
    }
    public float getReading() {
        return temperature;
    }

}