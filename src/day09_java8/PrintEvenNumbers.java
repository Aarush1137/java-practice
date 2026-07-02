package day09_java8;

import java.util.ArrayList;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        System.out.println("Using Normal Loop:");

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n");

        System.out.println("Using forEach():");

        numbers.forEach(num -> {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        });

        System.out.println("\n");

        System.out.println("Using Lambda:");

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.print(num + " "));
    }
}