package helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InformationReadFromFileHelper {
    public static void getTextFromFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\po1ak\\OneDrive\\Рабочий стол\\Java.txt.txt"))) {
            int character;
            while ((character = bufferedReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

