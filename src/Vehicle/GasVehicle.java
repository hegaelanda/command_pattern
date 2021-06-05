package Vehicle;

public class GasVehicle implements Function{
    private Vehicle vehicle;

    public GasVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void execute(){
        vehicle.gas();
    }
    
}
