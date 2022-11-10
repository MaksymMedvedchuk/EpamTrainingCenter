package chapter7.variantb.myComparator;

import chapter7.variantb.SentencePart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WordComparatorByFirstConsonantLetter implements Comparator<SentencePart> {

    private String letter;
    @Override
    public int compare(SentencePart someFirstWord, SentencePart someSecondWord) {
        int result;
        letter = null;
        List<SentencePart> list = someFirstWord.toString().

    }
}

