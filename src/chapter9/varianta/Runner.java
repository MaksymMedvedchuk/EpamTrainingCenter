package chapter9.varianta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Runner {
    public static final String PATH_TO_PROPERTIES = "C:\\Users\\po1ak\\IdeaProjects\\Mentoring\\src\\resources\\application.properties";

    public static void main(String[] args) {
        try (InputStream input = Runner.class.getClassLoader().getResourceAsStream("application.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            //load a properties file from class path, inside static method
            prop.load(input);

            //get the property value and print it out
            System.out.println(prop.getProperty("inputFile"));


        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}




