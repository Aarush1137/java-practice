package day04_oops;

public class Car {
    // Fields
    String company;
    String model;
    int year;

    // Parameterized Constructor
    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void display() {
        System.out.println("Company : " + this.company);
        System.out.println("Model   : " + this.model);
        System.out.println("Year    : " + this.year);
    }

    // Main method to test the class with two objects
    public static void main(String[] args) {
        // Creating the first car object
        Car c1 = new Car("Tesla", "Model 3", 2024);
        c1.display();

        System.out.println("--------------------");

        // Creating the second car object
        Car c2 = new Car("Toyota", "Camry", 2023);
        c2.display();
    }
}