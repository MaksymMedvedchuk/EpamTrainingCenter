package chapter9.varianta;

import helper.InputOutputHelper;

import java.io.*;

public class File {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(InputOutputHelper.getTextFromFile("inputFile")))) {
            int character;
            while ((character = bufferedReader.read()) != -1) {
                System.out.print((char)character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
