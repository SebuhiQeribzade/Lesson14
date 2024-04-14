package Runtime;
// Parent class Vehicle
class Vehicle {
    // Method to start the vehicle
    public void start() {
        System.out.println("The vehicle is starting...");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Override start method with a unique message for Car
    @Override
    public void start() {
        System.out.println("The car's engine is starting...");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    // Override start method with a unique message for Motorcycle
    @Override
    public void start() {
        System.out.println("The motorcycle's engine is starting...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Call start method using polymorphism
        car.start();  // Calls start method overridden in Car class
        motorcycle.start();  // Calls start method overridden in Motorcycle class
    }
}
