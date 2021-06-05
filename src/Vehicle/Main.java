package Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        
        RefuelVehicle rv = new RefuelVehicle(v);
        GasVehicle gv = new GasVehicle(v);
        BrakeVehicle bv = new BrakeVehicle(v);
        
        Control c = new Control();
        
        c.gasVehicle(gv);
        c.brakeVehicle(bv);
        c.refuelVehicle(rv);
        
    }
}
