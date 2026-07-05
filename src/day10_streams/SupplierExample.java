package day10_streams;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> greetSupplier = () -> "Hello, World!";
        Supplier<Double> otp =
                () -> Math.random();

        System.out.println(otp.get());
        System.out.println(greetSupplier.get());
        System.out.println(greetSupplier.get());
    }
}