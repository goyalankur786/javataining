package chapter22_javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileWithoutLoop {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\ashu\\IdeaProjects\\comjavatrain\\src\\test\\java\\chapter22_javaio\\text");
        Scanner sc=new Scanner(file);
        sc.useDelimiter("\\Z");//we need to use\\Z delimiter
        System.out.println(sc.next());
    }
}
