package chapter7.variantb;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    List<Sentence> sentenceList = new ArrayList<>();

    public void addSentence(Sentence sentence){
        sentenceList.add(sentence);
    }
}
