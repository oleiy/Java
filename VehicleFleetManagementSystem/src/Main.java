import VehicalFleetManagementSystem.Car;
import VehicalFleetManagementSystem.Engine;
import VehicalFleetManagementSystem.FuelTank;
import VehicalFleetManagementSystem.Truck;

public class Main {
    public static void main(String[] args) {

        Engine carEngine = new Engine(150,"Diesel");
        FuelTank fuelTank = new FuelTank(100);
        Car myCar = new Car("Audi","A4",2019,150,carEngine,fuelTank,4);
        Engine truckEngine = new Engine(400,"Diesel");
        FuelTank fuelTank1 = new FuelTank(200);
        Truck truck = new Truck("Volvo","V40",2019,150,truckEngine,fuelTank1,10);

        System.out.println("Informarion about car:");
        myCar.displayInfo();
        fuelTank1.consume(10);
        fuelTank1.refuel(20);
        myCar.displayInfo();

    }
}