package day09_java8;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;

        int num1 = 12;
        int num2 = 15;

        System.out.println(num1 + " is even: " + isEven.test(num1));
        System.out.println(num2 + " is even: " + isEven.test(num2));
    }
}