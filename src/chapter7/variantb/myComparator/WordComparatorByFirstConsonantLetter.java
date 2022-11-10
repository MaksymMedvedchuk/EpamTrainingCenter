package chapter7.variantb.myComparator;

import chapter7.variantb.SentencePart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WordComparatorByFirstConsonantLetter implements Comparator<SentencePart> {

    private static final List<Character> CHARACTER_LIST = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'y', 'u'));

    @Override
    public int compare(SentencePart someFirstWord, SentencePart someSecondWord) {
        return Character.compare(getFirstConsonantLetter(someFirstWord), getFirstConsonantLetter(someSecondWord));
    }

    public char getFirstConsonantLetter(SentencePart sentencePart) {
        char firstConsonant = 0;
        for (char character : sentencePart.toString().toCharArray()) {
            if (!CHARACTER_LIST.contains(character)) {
                firstConsonant = character;
                break;
            }
        }
        return firstConsonant;
    }
}


