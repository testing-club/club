package lesson12;

import java.io.FileInputStream;
import java.io.IOException;

public class ExampleFour {
    public static void main(String[] args)  {
        try {
            printFromFile("dgfhgdhfgdhf");
        } catch (IOException e) {
            System.out.println("Cant read from file");
        }

    }

    private static void printFromFile(String pathToFile) throws IOException {
        FileInputStream f = new FileInputStream(pathToFile);

        System.out.println("Content of file: " + f.read());
    }
}
