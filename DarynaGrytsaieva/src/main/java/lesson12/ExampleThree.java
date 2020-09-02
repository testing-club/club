package lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleThree {
    public static void main(String[] args) {
        printFromFile("path");

    }

    private static void printFromFile(String pathToFile) {
        FileInputStream f = null;
        try {
            f = new FileInputStream(pathToFile);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }


        try {
            System.out.println("Content of file: " + f.read());
        } catch (IOException | NullPointerException e) {
            System.out.println("Empty file of no file found");
        }
    }
}
