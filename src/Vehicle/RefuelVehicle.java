package Vehicle;

public class RefuelVehicle implements Function {
    private Vehicle vehicle;

    public RefuelVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void execute(){
        vehicle.refuel();
    }
}
