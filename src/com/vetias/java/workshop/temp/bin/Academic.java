package com.vetias.java.workshop.temp.bin;

public class Academic extends Building {
    private boolean islibaryavailable;
    private int isnumberofrooms;
    public void setIslibaryavailable(boolean islibaryavailable) {
        this.islibaryavailable = islibaryavailable;
    }
    public void setIsnumberofrooms(int isnumberofrooms) {
        this.isnumberofrooms = isnumberofrooms;
    }
    public boolean isIslibaryavailable() {
        return islibaryavailable;
    }
    public int getIsnumberofrooms() {
        return isnumberofrooms;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Library Available: " + islibaryavailable);
        System.out.println("Number of Rooms: " + isnumberofrooms);
    }
}