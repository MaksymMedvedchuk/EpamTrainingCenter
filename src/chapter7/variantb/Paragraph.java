package chapter7.variantb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Paragraph {

    List<Sentence> sentenceList = new ArrayList<>();

    public Paragraph(String paragraph) {
        parseParagraph(paragraph);
    }

    private void parseParagraph(String paragraphStr) {
        StringTokenizer sentenceTokenizer = new StringTokenizer(paragraphStr, ".!");
        while (sentenceTokenizer.hasMoreElements()) {
            String sentenceStr = sentenceTokenizer.nextToken();
            Sentence sentence = new Sentence(sentenceStr);
            sentenceList.add(sentence);
        }
    }

    public void addSentence(Sentence sentence) {
        sentenceList.add(sentence);
    }

    @Override
    public String toString() {
        return sentenceList.stream().map(Objects::toString).collect(Collectors.joining(" "));
    }
}

