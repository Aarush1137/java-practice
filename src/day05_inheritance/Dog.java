package day05_inheritance;

public class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}