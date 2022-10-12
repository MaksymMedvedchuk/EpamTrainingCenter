package chapter7.variantb;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    List<SentencePart> sentencePartList = new ArrayList<>();

    public void assSentencePart(SentencePart sentencePart){
        sentencePartList.add(sentencePart);


    }
}
