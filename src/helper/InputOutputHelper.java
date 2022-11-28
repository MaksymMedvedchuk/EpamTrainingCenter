package helper;

import chapter9.varianta.PropertiesKey;
import chapter9.varianta.PropertiesReader;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

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

    public String getTextFromArchive() {
        StringBuilder stringBuilder = new StringBuilder();
        try (ZipFile zipFile = new ZipFile(PropertiesReader.getProperties(PropertiesKey.INPUT_ARCHIVE_FILE.getKey()))) { // звернення до архіва
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();//повертає все що лежить в архіві
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



