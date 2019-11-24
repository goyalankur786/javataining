package chapter22_javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFileUsingScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ashu\\IdeaProjects\\comjavatrain\\src\\test\\java\\chapter22_javaio\\text");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
