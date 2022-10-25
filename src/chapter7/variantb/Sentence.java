package chapter7.variantb;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sentence {

    private static final String WORD_LENGTH = "\\b\\w{4,4}\\b";
    private static final String VOWEL_LETTERS = "^[aieouAIEOU].*";

    private final List<SentencePart> sentencePartList = new ArrayList<>();

    public Sentence() {
    }

    public Sentence(String sentence) {
        parseSentence(sentence);
    }

    public void parseSentence(String sentenceStr) {
        StringTokenizer sentencePartTokenizer = new StringTokenizer(sentenceStr, Delimiter.SENTENCE_PART_DELIMITER.getDelimiter(), true);
        while (sentencePartTokenizer.hasMoreElements()) {
            String sentencePartStr = sentencePartTokenizer.nextToken();
            if (sentencePartStr.equals(" ")) continue;
            SentencePart sentencePart = SentencePart.getSentencePart(sentencePartStr);
            addSentencePart(sentencePart);
        }
    }

    public void addSentencePart(SentencePart sentencePart) {
        sentencePartList.add(sentencePart);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (SentencePart sentencePart : sentencePartList) {
            if ((sentencePart instanceof Word) && (sentencePartList.indexOf(sentencePart) != 0))
                builder.append(Delimiter.SENTENCE_PART_SPACE.getDelimiter());
            builder.append(sentencePart);
            if (sentencePart.equals(sentencePartList.get(sentencePartList.size() - 1)))
                builder.append(Delimiter.SENTENCE_PART_DOT.getDelimiter());
        }
        return builder.toString();
    }

    public List<SentencePart> getSentencePartList() {
        return new ArrayList<>(sentencePartList);
    }

    public void isWordOfGivenLengthAndBeginsVowel() {
        List<SentencePart> list = new ArrayList<>();
        for (SentencePart sentencePart : sentencePartList) {
            if (!sentencePart.toString().matches(WORD_LENGTH) || !sentencePart.content.matches(VOWEL_LETTERS)) //чому тут || та чому sentencePart викликаємо toString?
                list.add(sentencePart);
        }
        printText(list);
    }

    private void printText(List<SentencePart> list) {
        StringBuilder builder = new StringBuilder();
        for (SentencePart sentencePart : list) {
            if ((sentencePart instanceof Word) && (list.indexOf(sentencePart) != 0))
                builder.append(Delimiter.SENTENCE_PART_SPACE.getDelimiter());
            builder.append(sentencePart);
            if (sentencePart.equals(list.get(list.size() - 1)))
                builder.append(Delimiter.SENTENCE_PART_DOT.getDelimiter());
        }
        System.out.println(builder);
    }

    public void printInfo() {
        List<SentencePart> list = new ArrayList<>();
        for (SentencePart sentencePart : sentencePartList) {
            list.add(sentencePart);

//            int length = sentencePartList.size();
//            for (int i = length - 1; i > 0; i--) {
//                for (int j = 1; j < length; j++) {
        }
    }
}









