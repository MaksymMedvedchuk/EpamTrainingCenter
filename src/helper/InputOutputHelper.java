package helper;

import chapter9.varianta.PropertiesKey;
import chapter9.varianta.PropertiesReader;

import java.io.*;

public class InputOutputHelper {

    public String getTextFromInputFile() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PropertiesReader.getProperties(PropertiesKey.INPUT_FILE.getKey())))) {
            String stringFromText;
            while ((stringFromText = bufferedReader.readLine()) != null)
                stringBuilder.append(stringFromText).append(" ");
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void setTextToOutputFile(String inputText) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PropertiesReader.getProperties(PropertiesKey.OUTPUT_FILE.getKey())))) {
            bufferedWriter.write(inputText);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}



