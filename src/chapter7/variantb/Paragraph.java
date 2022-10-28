package chapter7.variantb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Paragraph {

    private final List<Sentence> sentenceList = new ArrayList<>();

    public Paragraph(String paragraph) {
        parseParagraph(paragraph);
    }

    private void parseParagraph(String paragraphStr) {
        StringTokenizer sentenceTokenizer = new StringTokenizer(paragraphStr, Delimiter.SENTENCE_DELIMITER.getDelimiter());
        while (sentenceTokenizer.hasMoreElements()) {
            String sentenceStr = sentenceTokenizer.nextToken();
            Sentence sentence = new Sentence(sentenceStr);
            addSentence(sentence);
        }
    }

    public void addSentence(Sentence sentence) {
        sentenceList.add(sentence);
    }

    @Override
    public String toString() {
        return sentenceList.stream().map(Objects::toString).collect(Collectors.joining(Delimiter.SENTENCE_PART_SPACE.getDelimiter()));
    }

    public List<Sentence> getSentenceList() {
        return new ArrayList<>(sentenceList);
    }


    public void swapFirstAndLastWord() {
        for(Sentence sentence :sentenceList){
                SentencePart first = sentence.getFirstWord();
                SentencePart last = sentence.getLastWord();
                sentence.getSentencePartList().set(0, last);
            }
        }
    }


































