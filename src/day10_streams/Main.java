package day10_streams;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 4, 6, 3, 7);

        System.out.println("Even Numbers:");
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\nSquared Numbers:");
        numbers.stream()
                .map(num -> num * num)
                .forEach(System.out::println);

        System.out.println("\nSorted Numbers:");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nOriginal List:");
        numbers.stream()
                .forEach(System.out::println);
    }
}


