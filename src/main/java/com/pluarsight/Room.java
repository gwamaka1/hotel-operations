package com.pluarsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean availble;

    public Room(int numberOfBeds, boolean availble, boolean dirty, boolean occupied, double price) {
        this.numberOfBeds = numberOfBeds;
        this.availble = availble;
        this.dirty = dirty;
        this.occupied = occupied;
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailble() {
        if(!isDirty() && !isOccupied()){
        return availble;}

        return false;
    }
}
