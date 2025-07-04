package com.vetias.java.workshop.temp.bin;

public class Temperaturesensor implements sensor{
    private float temperature;
    
    public Temperaturesensor(float atemperature) {
        temperature = atemperature;
    }
    public float getReading() {
        return temperature;
    }

}