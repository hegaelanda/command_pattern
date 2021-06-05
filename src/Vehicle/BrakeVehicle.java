package Vehicle;

public class BrakeVehicle implements Function{
    private Vehicle vehicle;

    public BrakeVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void execute(){
        vehicle.brake();
    }
}
