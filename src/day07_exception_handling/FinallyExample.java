package day07_exception_handling;

public class FinallyExample {
    public static void main(String[] args) {
        // Scenario 1: Exception occurs
        System.out.println("--- Scenario 1: With Exception ---");
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("Finally block executes even after an exception.");
        }

        System.out.println("\n--- Scenario 2: No Exception ---");
        // Scenario 2: No exception
        try {
            int data = 25 / 5;
            System.out.println("Result is: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("Finally block executes when there is NO exception too.");
        }
    }
}