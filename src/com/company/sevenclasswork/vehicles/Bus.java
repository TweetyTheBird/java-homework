package com.company.sevenclasswork.vehicles;

public class Bus extends VehicleAbsract {
    private final int numDoors = 5;
    private final int numWheels = 10;
    protected int numSeats;
    private final String vehicleType = "bus";

    public Bus(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public int getNumberOfSeats() {
        return this.numSeats;
    }

    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void printVehicleInfo() {
        System.out.println("Vehicle type: " + vehicleType);
        System.out.println("Number of doors: " + numDoors);
        System.out.println("Number of wheels: " + numWheels);
        System.out.println("Number of seats: " + numSeats);
    }
}
