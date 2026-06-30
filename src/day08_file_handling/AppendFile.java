package day08_file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            // The 'true' parameter turns on append mode
            FileWriter appender = new FileWriter("example.txt", true);

            appender.write("\nThis line is appended! The previous text is still safe.");

            appender.close();
            System.out.println("Successfully appended new text to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}