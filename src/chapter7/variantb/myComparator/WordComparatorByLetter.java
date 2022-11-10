package chapter7.variantb.myComparator;

import chapter7.variantb.SentencePart;

import java.util.Comparator;

public class WordComparatorByLetter implements Comparator<SentencePart> {

    private final char letter;

    public WordComparatorByLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public int compare(SentencePart someFirstWord, SentencePart someSecondWord) {
        int result = Integer.compare(getLetterCount(someFirstWord), getLetterCount(someSecondWord));
        if (result == 0) {
            return someFirstWord.toString().compareToIgnoreCase(someSecondWord.toString());
        } else {
            return result;
        }
    }

    public int getLetterCount(SentencePart word) {//назва + реалізація!!!
        int count = 0;
        char[] lowerCaseWord = word.toString().toLowerCase().toCharArray();
        for (char c : lowerCaseWord) if (c == letter) count++;
        return count;
    }
}
