package day10_streams;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isAdult = num -> num >= 18;
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(7));  // false
        System.out.println(isAdult.test(21));
        System.out.println(isAdult.test(17));
    }
}