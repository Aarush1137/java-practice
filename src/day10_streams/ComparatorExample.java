package day10_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul", 22, 78));
        students.add(new Student(101, "Amit", 20, 92));
        students.add(new Student(104, "Neha", 21, 85));
        students.add(new Student(102, "Priya", 23, 89));

        // By Age
        students.sort((s1, s2) -> s1.getAge() - s2.getAge());

        System.out.println("Sorted By Age");

        students.forEach(System.out::println);

        // By Name
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println("\nSorted By Name");

        students.forEach(System.out::println);

        // By Marks Descending
        students.sort((s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks()));

        System.out.println("\nSorted By Marks Descending");

        students.forEach(System.out::println);
    }
}