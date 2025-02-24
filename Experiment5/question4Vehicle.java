abstract class Vehicle {
    private final String make;
    private final String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public abstract void startEngine();
    public abstract void stopEngine();
    public void serviceInfo() {
        System.out.println("Basic servicing instructions: Check oil, tire pressure, and brakes.");
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }
    @Override
    public void startEngine() {
        System.out.println("The car engine is starting...");
    }
    @Override
    public void stopEngine() {
        System.out.println("The car engine is stopping...");
    }
}

public class question4Vehicle{
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "Model S");
        myCar.startEngine();
        myCar.stopEngine();
        myCar.serviceInfo();
        System.out.println("Car make: " + myCar.getMake());
        System.out.println("Car model: " + myCar.getModel());
    }
}