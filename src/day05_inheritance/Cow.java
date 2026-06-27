package day05_inheritance;

public class Cow extends Animal {

    @Override
    void sound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}