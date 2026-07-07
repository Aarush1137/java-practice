package day10_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul", 22, 78));
        students.add(new Student(101, "Amit", 20, 92));
        students.add(new Student(104, "Neha", 21, 85));
        students.add(new Student(102, "Priya", 23, 89));

        System.out.println("Before Sorting");

        students.forEach(System.out::println);

        Collections.sort(students);

        System.out.println("\nAfter Sorting By ID (Comparable)");

        students.forEach(System.out::println);
    }
}