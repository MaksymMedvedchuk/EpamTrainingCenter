package chapter9.varianta;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Runner {
    public static final String PATH_TO_PROPERTIES = "application.properties";

    public static void main(String[] args) {
        FileInputStream fileInputStream;
        Properties prop = new Properties();
        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);

            String inputFile = prop.getProperty("inputFile");
            System.out.println(inputFile);
        } catch (IOException e) {
            System.out.println("Not found");
            e.printStackTrace();
        }
    }
}




