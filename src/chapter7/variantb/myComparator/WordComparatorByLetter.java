package chapter7.variantb.myComparator;

import chapter7.variantb.SentencePart;

import java.util.Comparator;

public class WordComparatorByLetter implements Comparator<SentencePart> {

    public String letter;

    public WordComparatorByLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public int compare(SentencePart someFirstWord, SentencePart someSecondWord) {
        int result = Integer.compare(getQuantityIInWordCount(someFirstWord), getQuantityIInWordCount(someSecondWord));
        if (result == 0) {
            return someFirstWord.toString().compareToIgnoreCase(someSecondWord.toString());//порівнюємо кожен чар по порядку словника
        } else {
            return result;
        }
    }

    public int getQuantityIInWordCount(SentencePart input) {
        int count = 0;
        String lowerCase = input.toString().toLowerCase();
        int index = lowerCase.indexOf(letter);//поветає перший індекс моєї літери?
        while (index >= 0) {
            count++;
            index = lowerCase.indexOf(letter, index + 1);
        }
        return count;
    }
}
