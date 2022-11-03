package chapter7.variantb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Sentence {



    private static final String WORD_BEGINS_VOWEL_LETTER = "^[aieouAIEOU].*";

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
            if ((sentencePart instanceof Word) && (sentencePartList.indexOf(sentencePart) != 0))//якщо не нульовий то ми апендимо пробіл?
                builder.append(Delimiter.SENTENCE_PART_SPACE.getDelimiter());
            builder.append(sentencePart);
            if (sentencePart.equals(sentencePartList.get(sentencePartList.size() - 1)))
                builder.append(Delimiter.SENTENCE_PART_DOT.getDelimiter());
        }
        return builder.toString();
    }

    public List<SentencePart> getSentencePartList() {
        return sentencePartList;
    }

    public void removeWordsOfGivenLengthAndBeginsVowel(int length) {
        sentencePartList.removeIf(sentencePart -> sentencePart instanceof Word && sentencePart.toString().length() == length
                && !sentencePart.toString().matches(WORD_BEGINS_VOWEL_LETTER));
    }

    public int getWordCount() {
        long count = 0L;
        for (SentencePart sentencePart : sentencePartList) {
            if (sentencePart instanceof Word) {
                count++;
            }
        }
        return (int) count;
    }

    public SentencePart getFirstWord() {
        return sentencePartList.get(0);
    }

    public SentencePart getLastWord() {
        return sentencePartList.get(sentencePartList.size() - 1);
    }

    public void getWordsListWithBeginVowel() {
        sentencePartList.stream()
                .map(sentencePart -> SentencePart.parseSentencePart(sentencePart.toString().toLowerCase()))
                .filter(part -> part.toString().matches(WORD_BEGINS_VOWEL_LETTER) && part instanceof Word)
                .sorted(Comparator.comparing(SentencePart::toString))
                .forEach(sentencePart -> System.out.println(sentencePart + " "));


    }

//        List<SentencePart> list = new ArrayList<>();
//        for (SentencePart sentencePart : sentencePartList) {
//            SentencePart part = SentencePart.parseSentencePart(sentencePart.toString().toLowerCase());
//            if (part.toString().matches(WORD_BEGINS_VOWEL_LETTER) && part instanceof Word) {
//                list.add(part);
//            }
//        }
//        list.sort(Comparator.comparing(SentencePart::toString));
//        return list;
//    }

//    public List<SentencePart> getWithI(String input){
//        List<SentencePart> list = new ArrayList<>();
//        for (SentencePart sentencePart : sentencePartList) {
//            if (sentencePart.toString().contains(input)) list.add(sentencePart);
//        }
//        return list;
//    }
}













































