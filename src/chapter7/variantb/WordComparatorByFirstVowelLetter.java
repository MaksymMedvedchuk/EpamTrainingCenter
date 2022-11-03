package chapter7.variantb;

import java.util.Comparator;

public class WordComparatorByFirstVowelLetter implements Comparator<SentencePart> {
    @Override
    public int compare(SentencePart someFirstWord, SentencePart someSecondWord) {
        return someFirstWord.toString().compareToIgnoreCase(someSecondWord.toString());
    }
}

