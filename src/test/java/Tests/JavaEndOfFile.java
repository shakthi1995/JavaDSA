package Tests;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class JavaEndOfFile {
    @Test
    public void FileReadSample() throws FileNotFoundException {
        String path = "src/test/Resource/input.txt";
        Scanner scanner = new Scanner(new FileReader(path));
        int lineNumber = 1;

        while(scanner.hasNext()){
            System.out.println(lineNumber + " " + scanner.nextLine());
            lineNumber++;
        }
        scanner.close();
    }
}
