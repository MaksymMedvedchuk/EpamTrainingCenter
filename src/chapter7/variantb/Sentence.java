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

    public void deleteLongestSubstringInSentence(char begin, char end) {
        SentencePart firstOccurrence = null;
        SentencePart lastOccurrence = null;
        for (SentencePart sentencePart : sentencePartList) {
            if (firstOccurrence == null && sentencePart.content.contains("" + begin)) firstOccurrence = sentencePart;
            if (sentencePart.content.contains("" + end)) lastOccurrence = sentencePart;
        }
        if (firstOccurrence == null || lastOccurrence == null) return;
        int firstSentencePartIndex = sentencePartList.indexOf(firstOccurrence);
        int lastSentencePartIndex = sentencePartList.lastIndexOf(lastOccurrence);

        if (firstSentencePartIndex > lastSentencePartIndex) return;

        if (firstSentencePartIndex == lastSentencePartIndex) {
            processIfTheSameSentencePart(begin, end, firstSentencePartIndex);
            return;
        }

        List<SentencePart> temporarySentencePartList = new ArrayList<>();
        for (int i = 0; i < sentencePartList.size(); i++) {
            if (i <= firstSentencePartIndex) temporarySentencePartList.add(sentencePartList.get(i));
            if (i >= lastSentencePartIndex) temporarySentencePartList.add(sentencePartList.get(i));
        }

        excludeSubstringAfterFirstOccurrence(begin, temporarySentencePartList);

        excludeSubstringBeforeLastOccurrence(end, temporarySentencePartList);

        this.sentencePartList.removeAll(sentencePartList);
        this.sentencePartList.addAll(temporarySentencePartList);
    }

    private void excludeSubstringBeforeLastOccurrence(char end, List<SentencePart> temporarySentencePartList) {
        for (int i = temporarySentencePartList.size() - 1; i >= 0; i--) {
            SentencePart sentencePart = temporarySentencePartList.get(i);
            if (sentencePart.content.contains("" + end)) {
                int endIndex = sentencePart.content.lastIndexOf(end);
                String toReplace = sentencePart.content.substring(0, endIndex + 1);
                sentencePart.content = sentencePart.content.replace(toReplace, "");
                break;
            }
        }
    }

    private void excludeSubstringAfterFirstOccurrence(char begin, List<SentencePart> temporarySentencePartList) {
        for (SentencePart sentencePart : temporarySentencePartList) {
            if (sentencePart.content.contains("" + begin)) {
                int beginIndex = sentencePart.content.indexOf(begin);
                String toReplace = sentencePart.content.substring(beginIndex);
                sentencePart.content = sentencePart.content.replace(toReplace, "");
                break;
            }
        }
    }

    private void processIfTheSameSentencePart(char begin, char end, int lastSentencePartIndex) {
        SentencePart target = sentencePartList.get(lastSentencePartIndex);
        int firstCharIndex = target.content.indexOf(begin);
        int lastCharIndex = target.content.lastIndexOf(end);
        if (firstCharIndex > lastCharIndex) return;
        String toReplace = target.content.substring(firstCharIndex, lastCharIndex + 1);
        target.content = target.content.replace(toReplace, "");
    }
}

























































