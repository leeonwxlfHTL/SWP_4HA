package ExeptionTesting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {

    public void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        try {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } finally {
            scanner.close();
        }
    }
}
