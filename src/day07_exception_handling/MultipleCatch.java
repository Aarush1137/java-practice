package day07_exception_handling;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            // Trigger 1: ArithmeticException
            // int calc = 50 / 0;

            // Trigger 2: NullPointerException
            String text = null;
            // System.out.println(text.length());

            // Trigger 3: ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Active trigger for this run

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index accessed.");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Attempted to use a null reference.");
        } catch (Exception e) {
            // A generic catch block is good practice as a fallback
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}