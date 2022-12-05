package helper;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ParsingTextHelper {

    private static final String DELIMITER = " ,.!;:?\n";

    public static List<String> getParsingText() {
        List<String> list = new ArrayList<>();
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        String text = inputOutputHelper.getTextFromInputFile();
        StringTokenizer stringTokenizer = new StringTokenizer(text, DELIMITER);

        while (stringTokenizer.hasMoreElements()) {
            String someString = stringTokenizer.nextToken();
            list.add(someString);
        }
        return list;
    }
}
