package day08_file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            // Create a File object
            File myFile = new File("example.txt");

            // Check if the file was created or already exists
            if (myFile.createNewFile()) {
                System.out.println("File created successfully: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}