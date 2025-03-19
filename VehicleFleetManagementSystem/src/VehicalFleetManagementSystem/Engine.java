package VehicalFleetManagementSystem;

public class Engine {

    private int power;
    private String fuelType;

    public void startEngine(){
        System.out.println("Engine have been started");
    }

    public void displayInfo(){
        System.out.println("Power of engine: "+power+"kW\nFuel type: "+fuelType);
    }

    public Engine(int power, String fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }
}
