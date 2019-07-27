package sevenclasswork.vehicles;

public abstract class VehicleAbsract implements Vehicle {
    protected  String vehicleType;

    @Override
    public abstract int getNumberOfSeats();

    @Override
    public abstract int getNumWheels();

    @Override
    public String getVehicleType() {
        return this.vehicleType;
    }

    public abstract void printVehicleInfo();
}
