package day07_exception_handling;

public class TryCatchExample {
    public static void main(String[] args) {
        System.out.println("Starting division...");

        try {
            int result = 10 / 0; // This will trigger an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Program continues executing normally.");
    }
}