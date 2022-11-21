package helper;

import java.io.*;
import java.util.Properties;

public class InputOutputHelper {

    public static final String PATH_TO_PROPERTIES = "application.properties";

    public static String getTextFromFile(String key) {
        try (InputStream input = InputOutputHelper.class.getClassLoader().getResourceAsStream(PATH_TO_PROPERTIES)) {
            Properties properties = new Properties();
            properties.load(input);
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return key;
    }

    public void writeTextToFile() {
        try (InputStream output = InputOutputHelper.class.getClassLoader().getResourceAsStream(PATH_TO_PROPERTIES)){
            Properties properties = new Properties();
            properties.store(output, null);
            properties.setProperty("outputFile", "dddddddddddd");
            System.out.println(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


