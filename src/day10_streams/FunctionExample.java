package day10_streams;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = str -> str.length();

        System.out.println(stringLength.apply("Java"));
        System.out.println(stringLength.apply("Functional"));
        int a = stringLength.apply("kdjsjsfdpj");
        System.out.println(a);
    }
}