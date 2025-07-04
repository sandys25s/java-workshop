package com.vetias.java.workshop.temp.bin;

public class Temperaturesensor implements Sensor{
    private float temperature;

    public Temperaturesensor(float atemperature) {
        temperature = atemperature;
    }
    public float getReading() {
        return temperature;
    }

}