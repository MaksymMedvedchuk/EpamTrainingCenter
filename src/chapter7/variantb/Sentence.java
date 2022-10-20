package chapter7.variantb;

import java.util.*;
import java.util.stream.Collectors;

public class Sentence {

    List<SentencePart> sentencePartList = new ArrayList<>();

    public Sentence(String sentence) {
        parseSentence(sentence);
    }

    public void parseSentence(String sentenceStr) {
        StringTokenizer sentencePartTokenizer = new StringTokenizer(sentenceStr, " ,:;", true);
        while (sentencePartTokenizer.hasMoreElements()) {
            String sentencePartStr = sentencePartTokenizer.nextToken();
            if (sentencePartStr.equals(" ")) continue;
            SentencePart sentencePart = SentencePart.getSentencePart(sentencePartStr);
            sentencePartList.add(sentencePart);
        }
    }

    public void addSentencePart(SentencePart sentencePart) {
        sentencePartList.add(sentencePart);
    }

    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (SentencePart sentencePart : sentencePartList) {
//            sb.append(sentencePart);
//        }
//        return sb.toString();

        return sentencePartList.stream().map(Objects::toString).collect(Collectors.joining(" ", "", "."));
    }
}
