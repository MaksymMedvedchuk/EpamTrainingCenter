package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class InputOutputHelper {

    public static final String PATH_TO_PROPERTIES = "application.properties";

    public static String getTextFromFile(String key) {
        try(InputStream input = InputOutputHelper.class.getClassLoader().getResourceAsStream(PATH_TO_PROPERTIES)) {
            Properties properties = new Properties();
            if (input == null) throw new IllegalArgumentException("eror");
            properties.load(input);
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return key;
    }




//        FileInputStream fileInputStream;
//        Properties prop = new Properties();
//        try {
//            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
//            prop.load(fileInputStream);
//            return prop.getProperty(key);
//        } catch (IOException e) {
//            System.out.println("Error in the program: file " + PATH_TO_PROPERTIES + " not fount");
//            e.printStackTrace();
//        } return prop.getProperty(key);
    }


