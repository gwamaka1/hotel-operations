package com.pluarsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, double reservationTotal, boolean weekend, int numberOfNights, double price) {
        this.roomType = roomType;
        this.reservationTotal = reservationTotal;
        this.weekend = weekend;
        this.numberOfNights = numberOfNights;
        this.price = price;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;

    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (roomType.equalsIgnoreCase("queen")) {
            price = 124.00;

        }
        if (roomType.equalsIgnoreCase("king") || roomType.equalsIgnoreCase("queen") && isWeekend(true)) {
            price = price * 1.10;
        }
        return price;
    }

    public boolean isWeekend(boolean isWeekend) {
        return weekend;
    }

    public double getReservationTotal() {
        reservationTotal = price * numberOfNights;
        return reservationTotal;
    }
}

