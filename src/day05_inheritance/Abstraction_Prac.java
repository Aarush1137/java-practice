package day05_inheritance;

public class Abstraction_Prac {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        System.out.println("----- Dog -----");
        dog.sound();
        dog.eat();
        dog.sleep();

        System.out.println();

        System.out.println("----- Cat -----");
        cat.sound();
        cat.eat();
        cat.sleep();

        System.out.println();

        System.out.println("----- Cow -----");
        cow.sound();
        cow.eat();
        cow.sleep();
    }
}