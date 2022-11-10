package chapter7.variantb;

import chapter7.variantb.myComparator.WordComparatorByFirstConsonantLetter;
import chapter7.variantb.myComparator.WordComparatorByLetter;

import java.util.*;
import java.util.stream.Collectors;

public class Text {

    private static final String WORD_BEGINS_VOWEL_LETTER = "^[aieouAIEOU].*";

    private final List<Paragraph> paragraphList = new ArrayList<>();

    public static Text parseText(String textStr) {
        Text text = new Text();
        StringTokenizer textTokenizer = new StringTokenizer(textStr, Delimiter.PARAGRAPH_DELIMITER.getDelimiter());
        while (textTokenizer.hasMoreElements()) {
            String paragraphStr = textTokenizer.nextToken().trim();
            Paragraph paragraph = new Paragraph(paragraphStr);
            text.addParagraph(paragraph);
        }
        return text;
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphList.add(paragraph);
    }

    public void removeWordsOfGivenLengthAndBeginsVowel(int length) {
        for (Paragraph paragraph : paragraphList) {
            for (Sentence sentence : paragraph.getSentenceList()) {
                sentence.removeWordsOfGivenLengthAndBeginsVowel(length);
            }
        }
    }

    public void printSentencesOrderIncreasingWords() {
        List<Sentence> sentenceList = new ArrayList<>();
        for (Paragraph paragraph : paragraphList) {
            sentenceList.addAll(paragraph.getSentenceList());
        }
        sentenceList.sort(Comparator.comparing(Sentence::getWordCount));
        sentenceList.forEach(System.out::println);
    }

    public void swapFirstAndLastSentenceWords() {
        for (Paragraph paragraph : paragraphList) {
            paragraph.swapFirstAndLastWord();
        }
    }

    public void printWordsAlphabeticalOrderByFirstLetter() {
        List<SentencePart> list = new ArrayList<>();
        for (Paragraph paragraph : paragraphList) {
            for (Sentence sentence : paragraph.getSentenceList()) {
                for (SentencePart sentencePart : sentence.getSentencePartList()) {
                    if (sentencePart instanceof Word)
                        list.add(SentencePart.parseSentencePart(sentencePart.toString().toLowerCase()));
                }
            }
        }
        sort(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (isEqualFirstLettersAdjacentWords(list, i))
                stringBuilder.append(list.get(i)).append(Delimiter.SENTENCE_PART_SPACE.getDelimiter());
            else stringBuilder.append(list.get(i - 1)).append(Delimiter.PARAGRAPH_DELIMITER.getDelimiter());
        }
        System.out.println(stringBuilder);
    }

    private boolean isEqualFirstLettersAdjacentWords(List<SentencePart> list, int i) {//змінив назву методу!!!
        return i == 0 || list.get(i - 1).toString().charAt(0) == list.get(i).toString().charAt(0);
    }

    private void sort(List<SentencePart> list) {
        list.sort(Comparator.comparing(SentencePart::toString));
    }

    public List<SentencePart> sortByGivenLetter(char letter) {
        List<SentencePart> list = new ArrayList<>();
        for (Paragraph paragraph : paragraphList) {
            for (Sentence sentence : paragraph.getSentenceList()) {
                for (SentencePart sentencePart : sentence.getWordsContainingLetter(String.valueOf(letter))) {//змінив назву методу!!!
                    sentencePart = SentencePart.parseSentencePart(sentencePart.toString().toLowerCase());
                    list.add(sentencePart);
                }
            }
        }
        list.sort(new WordComparatorByLetter(letter));//перероюив Comparator!!!
        return list;
    }

    public List<SentencePart> sortByFirstConsonantLetter() {//назва!!!
        List<SentencePart> list = new ArrayList<>();
        for (Paragraph paragraph : paragraphList) {
            for (Sentence sentencePart : paragraph.getSentenceList()) {
                list.addAll(sentencePart.getWordsBeginVowel());
            }
        }
        list.sort(new WordComparatorByFirstConsonantLetter());//доробив Comparator!!!
        return list;
    }

    public void checkLongestPalindromeSubstring() {
        for (Paragraph paragraph : paragraphList) {
            for (Sentence sentence : paragraph.getSentenceList()) {

            }
        }
    }

    @Override
    public String toString() {
        return paragraphList.stream().map(Objects::toString).collect(Collectors.joining(Delimiter.PARAGRAPH_DELIMITER.getDelimiter()));
    }

    public List<Paragraph> getParagraphList() {
        return new ArrayList<>(paragraphList);
    }
}
















