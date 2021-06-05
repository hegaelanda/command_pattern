package Vehicle;

public class Vehicle {
    private int maxFuel = 100;
    private int maxSpeed = 50;
    private int currentSpeed = 0;
    private int currentFuel = maxFuel;
    
    public void refuel(){
        currentFuel = maxFuel;
        System.out.println("Now the fuel is up to " + currentFuel);
    }
    
    public void gas(){
        if (currentSpeed < maxSpeed && currentFuel > 0){
            currentSpeed += 10;
            currentFuel -= 10;
            System.out.println("Speed up the vehicle to " + currentSpeed + " Km/h");
            System.out.println("Fuel drain to " + currentFuel + " liter");
        }else{
            if(currentSpeed >= 100){
                System.out.println("Maximum speed");
            }else if(currentFuel <=0){
                System.out.println("The fuel is empty, the vehicle is stopping");
                currentSpeed = 0;
            }
        }
    }
    
    public void brake(){
       if (currentSpeed == 0) {
            System.out.println("The car stops");
        }else{
            currentSpeed -= 10;
            System.out.println("Slow down the vehicle to " + currentSpeed + " Km/h");
        }
    }
}
