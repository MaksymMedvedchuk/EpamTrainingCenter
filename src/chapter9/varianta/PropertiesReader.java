package chapter9.varianta;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    public static final String PATH_TO_PROPERTIES = "application.properties";

    public static String getProperties(String key) {
        try (InputStream input = PropertiesReader.class.getClassLoader().getResourceAsStream(PATH_TO_PROPERTIES)) {
            Properties properties = new Properties();
            properties.load(input);
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
