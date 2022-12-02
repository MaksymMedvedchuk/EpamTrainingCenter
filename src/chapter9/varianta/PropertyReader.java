package chapter9.varianta;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    public static final String PATH_TO_PROPERTIES = "application.properties";

    public static String getProperties(PropertiesKeys key) {
        try (InputStream input = PropertyReader.class.getClassLoader().getResourceAsStream(PATH_TO_PROPERTIES)) {
            Properties properties = new Properties();
            properties.load(input);
            return properties.getProperty(key.getKey());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
