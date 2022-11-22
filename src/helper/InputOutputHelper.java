package helper;

import chapter9.varianta.PropertiesKey;
import chapter9.varianta.PropertiesReader;

import java.io.*;
import java.util.StringTokenizer;

public class InputOutputHelper {

    private static final String DELIMITER = " ,.!;:?";

    public String getTextFromInputFile() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PropertiesReader.getProperties(PropertiesKey.INPUT_FILE.getKey())))) {
            String stringFromText;
            while ((stringFromText = bufferedReader.readLine()) != null)
                stringBuilder.append(stringFromText);
            StringBuilder parseStringBuilder = parseText(stringBuilder);
            return parseStringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private StringBuilder parseText(StringBuilder stringBuilder) {
        StringTokenizer stringTokenizer = new StringTokenizer(stringBuilder.toString(), DELIMITER);
        StringBuilder builder = new StringBuilder();
        while (stringTokenizer.hasMoreElements()) {
            String string = stringTokenizer.nextToken();
            builder.append(string).append(" ");
        }
        return builder;
    }

    public void setTextToFile(String inputText) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PropertiesReader.getProperties(PropertiesKey.OUTPUT_FILE.getKey())))) {
            bufferedWriter.write(inputText);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}



