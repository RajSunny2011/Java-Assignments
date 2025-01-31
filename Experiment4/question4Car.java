public class question4Car {
    public static void main(String[] args) {
        car car = new car("Toyota", "Camry", 2019);
        car.displayCar();
    }
}

class car{
    String make;
    String model;
    int year;

    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year; 
    }
    public void displayCar() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year of manufacture: " + year);
    }
}