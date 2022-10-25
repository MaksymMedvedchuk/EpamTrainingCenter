package chapter7.variantb;

import java.util.*;
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
}

//    public void print() {
//        List<Sentence> list = new ArrayList<>(sentenceList);
//        list.stream().map(Objects::toString).sorted().forEach(System.out::println);
//        }
//    }


//        for (Sentence sentence : sentenceList) {
//            Collections.sort(sentence.toString().length());
//
//        }
//        List<Sentence> list = new ArrayList<>();
//        for (Sentence sentence : sentenceList) {
//            list.add(sentence);
//          list.sort(new Sentence.);
//            System.out.println(list);
//
//        }
//        Comparator<Sentence> comparator = Comparator.comparingInt(a -> a.toString().length());
//        sentenceList.stream().sorted(comparator).forEach(System.out::println);






