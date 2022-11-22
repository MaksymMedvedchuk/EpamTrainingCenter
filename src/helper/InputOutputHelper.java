package helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class InputOutputHelper {

    public static final String PATH_TO_PROPERTIES = "application.properties";

    public static String getKeyFromProperties(String key) { //члому ідеа каже робити ці методи статичними?
        try (InputStream input = InputOutputHelper.class.getClassLoader().getResourceAsStream(PATH_TO_PROPERTIES)) {
            Properties properties = new Properties();
            properties.load(input);
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return key;
    }

    public static StringBuilder getTextFromKey() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(InputOutputHelper.getKeyFromProperties("inputFile")))) {
            String stringFromText;
            while ((stringFromText = bufferedReader.readLine()) != null)
                stringBuilder.append(stringFromText);
            return stringBuilder;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder;
    }

//    public void writeTextToFile(StringBuilder inputText)  {
//        try (FileWriter fileWriter = new FileWriter(PATH_TO_PROPERTIES)){
//            Properties properties = new Properties();
//            properties.setProperty("outputFile", "" + "JavaOutput.txt");
//            properties.store(fileWriter, null);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}



