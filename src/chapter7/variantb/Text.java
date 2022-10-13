package chapter7.variantb;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Text {
    List<Paragraph> paragraphList = new ArrayList<>();

    public void addParagraph(Paragraph paragraph) {
        paragraphList.add(paragraph);
    }

    public static Text getParsText(String input) {
        Text text = new Text();
        StringTokenizer stringTokenizer = new StringTokenizer(input, "\t");
        while (stringTokenizer.hasMoreElements()) {
            String token = stringTokenizer.nextToken();
            System.out.println(token);
        }
        return text;
    }



}
