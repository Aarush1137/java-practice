package day10_streams;

import java.util.function.Function;

public class FunctionExamples {
    static void main(String[] args) {
        Function<String,Integer> length = str -> str.length();
        System.out.println("length: "+ length.apply("Infosys"));

        Function<Integer,Integer> square = num -> num*num;
        System.out.println("Square of num :"+square.apply(3));

        Function<String, String> upper = str -> str.toUpperCase();
        System.out.println("Uppercase: " + upper.apply("java"));

        Function<Integer, String> evenOdd =
                num -> num % 2 == 0 ? "Even" : "Odd";
        System.out.println(evenOdd.apply(25));

        Function<String, Character> firstChar =
                str -> str.charAt(0);
        System.out.println(firstChar.apply("Streams"));
    }
}
