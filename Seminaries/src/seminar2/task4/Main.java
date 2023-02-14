package seminar2.task4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.
 */
public class Main {
    public static void main(String[] args) {
        String s = "TEST";
        String myStr = createStr(400, s);
        System.out.println(myStr);

    }

    static String createStr(int n, String a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a);
        }
        return sb.toString();
    }

    public void writeToFile(String s) throws IOException {


        try (FileWriter test = new FileWriter("test.txt", true)) {
            test.write(s);
        } catch (Exception e) {
            System.out.println("Было исключение" + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}



