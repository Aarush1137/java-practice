package day09_java8;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringLambda {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Aarush");
        names.add("Neha");
        names.add("Priya");
        names.add("Karan");

        System.out.println("Before Sorting: " + names);

        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("After Sorting: " + names);
    }
}