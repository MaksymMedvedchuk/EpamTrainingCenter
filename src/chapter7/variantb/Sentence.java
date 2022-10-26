package chapter7.variantb;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sentence {

    private static final String WORD_BEGINS_CONSONANT_LETTER = "^[aieouAIEOU].*";

    private final List<SentencePart> sentencePartList = new ArrayList<>();


    public Sentence(String sentence) {
        parseSentence(sentence);
    }

    public void parseSentence(String sentenceStr) {
        StringTokenizer sentencePartTokenizer = new StringTokenizer(sentenceStr, Delimiter.SENTENCE_PART_DELIMITER.getDelimiter(), true);
        while (sentencePartTokenizer.hasMoreElements()) {
            String sentencePartStr = sentencePartTokenizer.nextToken();
            if (sentencePartStr.equals(" ")) continue;
            SentencePart sentencePart = SentencePart.parseSentencePart(sentencePartStr);
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

    public void removeWordsOfGivenLengthAndBeginsVowel(int length) {
        sentencePartList.removeIf(sentencePart -> sentencePart instanceof Word && sentencePart.toString().length() == length
                && !sentencePart.toString().matches(WORD_BEGINS_CONSONANT_LETTER));//removeIf приймає Predicate в якого один аргумент
        // і якщо для нього(sentencePart) умова true то він його вертає(видаляє в нашому випадку
        //System.out.println(this);//якщо this то це ссилка на поточний обєкт. Як це можна записати по іншому
    }

    public int getWordCount() {
        return (int) sentencePartList.stream().filter(sentencePart -> sentencePart instanceof Word).count();
    }

    public void swapFirstAndLastWord() {
        for (SentencePart sentencePart : sentencePartList) {
            if (sentencePart instanceof Word){





            }
        }
    }
}










