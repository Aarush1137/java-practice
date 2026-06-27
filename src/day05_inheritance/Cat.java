package day05_inheritance;

public class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}