package chapter9.varianta;

import java.io.*;

public class File {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\po1ak\\OneDrive\\Рабочий стол\\Java.txt.txt"))) {
            int character;
            while ((character = bufferedReader.read()) != -1) {
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
