package chapter7.variantb.myComparator;

import chapter7.variantb.SentencePart;

import java.util.Comparator;

public class WordComparatorByFirstVowelLetter implements Comparator<SentencePart> {
    @Override
    public int compare(SentencePart someFirstWord, SentencePart someSecondWord) {
        return someFirstWord.toString().compareToIgnoreCase(someSecondWord.toString());
    }
}

