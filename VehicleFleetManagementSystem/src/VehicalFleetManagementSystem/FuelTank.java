package VehicalFleetManagementSystem;

public class FuelTank {

    private double capacity;
    private double currentFuel;

    public void refuel(double amount){
        if(currentFuel+amount>capacity){
            System.out.println("U can not refuel. Max level of fuel: "+capacity);
        }else{
            currentFuel+=amount;
            System.out.println("Fuel tank refuel: "+amount+"L");
        }
    }

    public void consume(double amount){
        if(amount > currentFuel){
            System.out.println("U can not consume. Current fuel level: "+currentFuel+"L");
        }else{
            currentFuel-=amount;
            System.out.println("Fuel tank consumed: "+amount+"L");
        }
    }

    public void displayInfo(){
        System.out.println("Current fuel level: "+currentFuel+"L\nFuel tank capacity: "+capacity+"L");
    }

    public FuelTank(double capacity) {
        this.capacity = capacity;
    }
}
