package helper;

import chapter9.varianta.PropertiesKeys;
import chapter9.varianta.PropertyReader;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class InputOutputHelper {

    public String getTextFromInputFile() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PropertyReader.getProperties(PropertiesKeys.INPUT_FILE)))) {
            String stringFromText;
            while ((stringFromText = bufferedReader.readLine()) != null)
                stringBuilder.append(stringFromText).append("\n");
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void printTextToOutputFile(String inputText) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PropertyReader.getProperties(PropertiesKeys.OUTPUT_FILE)))) {
            bufferedWriter.write(inputText);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public String getTextFromArchive() {
        StringBuilder stringBuilder = new StringBuilder();
        try (ZipFile zipFile = new ZipFile(PropertyReader.getProperties(PropertiesKeys.INPUT_ARCHIVE_FILE))) {
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            ZipEntry zipEntry = enumeration.nextElement();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(zipEntry)));
            String stringFromText;
            while ((stringFromText = bufferedReader.readLine()) != null)
                stringBuilder.append(stringFromText).append(" ");
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}



