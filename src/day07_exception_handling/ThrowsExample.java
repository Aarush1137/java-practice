package day07_exception_handling;

import java.io.IOException;

public class ThrowsExample {

    // Method declares that it throws an exception
    public static void processFile() throws Exception {
        boolean fileFound = false;

        if (!fileFound) {
            throw new Exception("Simulated File Not Found Error");
        }
        System.out.println("File processed successfully.");
    }

    public static void main(String[] args) {
        // The caller (main) must handle it
        try {
            processFile();
        } catch (Exception e) {
            System.out.println("Handled the declared exception in main: " + e.getMessage());
        }
    }
}