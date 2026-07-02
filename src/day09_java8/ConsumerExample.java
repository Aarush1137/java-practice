package day09_java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Aarush");
        names.add("Rahul");
        names.add("Priya");
        names.add("Neha");

        Consumer<String> printName = name -> System.out.println(name);

        names.forEach(printName);
    }
}