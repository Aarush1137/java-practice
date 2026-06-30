package day08_file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("example.txt");
            Scanner reader = new Scanner(myFile);

            System.out.println("--- Reading File Contents ---");
            // Loop through the file line by line
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
            System.out.println("-----------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: The file was not found.");
            e.printStackTrace();
        }
    }
}