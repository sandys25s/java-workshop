package com.vetias.java.workshop.temp.bin;

public class Hostel extends Building {
    private boolean ismessavailable;
    private int numberofrooms;
    public void setIsmessavailable(boolean ismessavailable) {
        this.ismessavailable = ismessavailable;
    }
    public void setNumberofrooms(int numberofrooms) {
        this.numberofrooms = numberofrooms;
    }
    public boolean isIsmessavailable() {
        return ismessavailable;
    }
    public int getNumberofrooms() {
        return numberofrooms;
    }

