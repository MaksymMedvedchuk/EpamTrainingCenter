package chapter7.variantb;

import java.util.*;
import java.util.stream.Collectors;

public class Text {

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
            for (Sentence sentence : paragraph.getSentenceList()) {
                sentenceList.add(sentence);
            }
        }
        sentenceList.sort(Comparator.comparing(Sentence::getWordCount));
        sentenceList.forEach(System.out::println);
    }
    
    @Override
    public String toString() {
        return paragraphList.stream().map(Objects::toString).collect(Collectors.joining(Delimiter.PARAGRAPH_DELIMITER.getDelimiter()));
    }

    public List<Paragraph> getParagraphList() {
        return new ArrayList<>(paragraphList);
    }
}
