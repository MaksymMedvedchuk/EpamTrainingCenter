package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class InputOutputHelper {

    public static final String PATH_TO_PROPERTIES = "src/resources/application.properties";

    public static void getTextFromFile() {
        FileInputStream fileInputStream;
        Properties prop = new Properties();
        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
            String inputFile = prop.getProperty("inputFile");
        } catch (IOException e) {
            System.out.println("Error in the program: file " + PATH_TO_PROPERTIES + " not fount");
            e.printStackTrace();
        }
    }
}

