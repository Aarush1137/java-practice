package day09_java8;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerLambda {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(10);
        numbers.add(78);
        numbers.add(23);
        numbers.add(5);

        System.out.println("Before Sorting: " + numbers);

        Collections.sort(numbers, (a, b) -> a.compareTo(b));

        System.out.println("After Sorting: " + numbers);
    }
}