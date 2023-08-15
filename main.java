package org.example;

class Kenderaan {
    final String brand;

    public Kenderaan(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Vehicle started.");
    }
}

class Kereta extends Kenderaan {
    public Kereta(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    public void drive() {
        System.out.println("Car is driving.");
    }

    public void brand() {
        System.out.println("Car brand is " + brand + ".");
    }
}

public class TryAndCatch {
    public static void main(String[] args) {
        try {
            // Create a Car object
            Car myCar = new Car("Honda");

           // Start the car
            myCar.start();

            // Drive the car
            myCar.drive();

            // Display car brand
            myCar.brand();

            // Check if the car brand is not "Honda"
            if (!myCar.brand.equals("Honda")) {
                throw new IllegalArgumentException("Error: Car brand is not Honda.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
