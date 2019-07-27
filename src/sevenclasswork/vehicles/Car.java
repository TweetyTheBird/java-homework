package sevenclasswork.vehicles;

public class Car extends VehicleAbsract {

    private final int numDoors = 3;
    private final int numWheels = 4;
    protected int numSeats;
    private final String vehicleType = "car";

    public Car(int numSeats) {
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
