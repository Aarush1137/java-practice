package day10_streams;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printUpper = str -> System.out.println(str.toUpperCase());
        Consumer<Integer> square =
                n -> System.out.println(n * n);

        square.accept(5);
        square.accept(35);
        printUpper.accept("hello");
        printUpper.accept("java");
    }
}
