package chapter4.task1;

import java.util.List;

public class Text {

    private List<Sentence> sentenceList;
    private String header = "Header";

    public Text(List<Sentence> sentenceList) {
        this.sentenceList = sentenceList;
    }
}
