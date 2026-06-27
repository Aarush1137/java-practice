package day05_inheritance;

public abstract class Animal {

    // Abstract method (no implementation)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("The animal is sleeping.");
    }

    void eat() {
        System.out.println("The animal is eating.");
    }
}