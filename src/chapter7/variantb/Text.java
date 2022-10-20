package chapter7.variantb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Text {

    List<Paragraph> paragraphList = new ArrayList<>();

    public void addParagraph(Paragraph paragraph) {
        paragraphList.add(paragraph);
    }

    public static Text parseText(String textStr){
        Text text = new Text();
        StringTokenizer textTokenizer = new StringTokenizer(textStr, "\t");
        while (textTokenizer.hasMoreElements()){
            String paragraphStr = textTokenizer.nextToken().trim();
            Paragraph paragraph = new Paragraph(paragraphStr);
            text.addParagraph(paragraph);
        }
        return text;
    }

    @Override
    public String toString() {
        return paragraphList.stream().map(Objects::toString).collect(Collectors.joining("\n"));
    }
}
