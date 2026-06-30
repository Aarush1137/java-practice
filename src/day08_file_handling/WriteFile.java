package day08_file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            // Initialize FileWriter
            FileWriter writer = new FileWriter("example.txt");

            // Write text to the file
            writer.write("Hello! This is the first line of text in our file.\n");
            writer.write("File handling in Java is quite straightforward.");

            // Always close the writer to save changes and free resources
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}