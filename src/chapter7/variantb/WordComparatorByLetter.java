package chapter7.variantb;

import java.util.Comparator;

public class WordComparatorByLetter implements Comparator<SentencePart> {

    public String letter;

    public WordComparatorByLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public int compare(SentencePart s1, SentencePart s2) {
        int result = Integer.compare(getQuantityIInWordCount(s1), getQuantityIInWordCount(s2));
        if (result == 0) {
            return s1.toString().compareToIgnoreCase(s2.toString());//порівнюємо кожен чар по порядку словника
        } else {
            return result;
        }
    }

    public int getQuantityIInWordCount(SentencePart sentencePart){
        int count = 0;
        String lowerCase = sentencePart.toString().toLowerCase();
        int index = lowerCase.indexOf(letter);//поветає перший індекс моєї літери?
        while (index >= 0) {
            count++;
            index = lowerCase.indexOf(letter, index + 1);
        }
        return count;
    }
}
