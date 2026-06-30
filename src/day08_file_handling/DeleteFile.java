package day08_file_handling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("example.txt");

        // delete() returns true if successful, false otherwise
        if (myFile.delete()) {
            System.out.println("Deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file. It may not exist.");
        }
    }
}