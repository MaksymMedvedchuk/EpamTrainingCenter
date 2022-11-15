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

    public long getWordCount() {
        return sentencePartList.stream().filter(sentencePart -> sentencePart instanceof Word).count();
    }

    public SentencePart getFirstWord() {
        return sentencePartList.get(0);
    }

    public SentencePart getLastWord() {
        return sentencePartList.get(sentencePartList.size() - 1);
    }

    public List<SentencePart> getWordsBeginVowel() {
        return sentencePartList.stream().map(sentencePart -> SentencePart.parseSentencePart(sentencePart.toString().toLowerCase())).filter(part -> part.toString().matches(WORD_BEGINS_VOWEL_LETTER) && part instanceof Word && part.toString().length() >= 2).sorted(Comparator.comparing(SentencePart::toString)).collect(Collectors.toList());
    }

    public List<SentencePart> getWordsContainingLetter(String letter) {
        List<SentencePart> list = new ArrayList<>();
        for (SentencePart sentencePart : sentencePartList) {
            if (sentencePart.toString().contains(letter)) list.add(sentencePart);
        }
        return list;
    }

    public void deleteLongestSubstringInSentence(String begin, String end) {
        List<SentencePart> list = new ArrayList<>();
        for (SentencePart sentencePart : sentencePartList) {
            int beginIndex = sentencePart.content.indexOf(begin);
            int endIndex = sentencePart.content.lastIndexOf(end) + 1;
            if (beginIndex == -1) list.add(sentencePart);
            else list.add(SentencePart.parseSentencePart(sentencePart.content.replaceAll(sentencePart.content.substring(beginIndex, endIndex), "")));
        }
        System.out.println(list);
    }
}

//робив ретерн і хотів друкувати через Ранер, але друкувало просто текст





















































