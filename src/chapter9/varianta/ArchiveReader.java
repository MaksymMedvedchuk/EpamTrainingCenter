package chapter9.varianta;

import helper.InputOutputHelper;

public class ArchiveReader {

    public void readFromFile() {
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        String text = inputOutputHelper.getTextFromArchive();
        printInfo(text);
    }

    private void printInfo(String text) {
        System.out.println(text);
    }
}
