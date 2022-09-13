package chapter4.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private final List<Sentence> sentenceList = new ArrayList<>();
    private String header;

    public void addSentence(Sentence sentence) {
        sentenceList.add(sentence);
    }

    public void printText() {
        System.out.println(header);
        for (Sentence sentence : sentenceList) {
            System.out.println(sentence.toString());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        Text text = (Text) o;
        return Objects.equals(sentenceList, text.sentenceList) && Objects.equals(header, text.header);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentenceList, header);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}






