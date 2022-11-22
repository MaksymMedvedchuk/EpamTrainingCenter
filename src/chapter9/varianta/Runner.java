package chapter9.varianta;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {
        SubstringRemovePrinter substringRemovePrinter = new SubstringRemovePrinter();
        WordsWithVowelPrinter wordsWithVowelPrinter = new WordsWithVowelPrinter();
        WordsWithSameLetterPrinter wordsWithSameLetterPrinter = new WordsWithSameLetterPrinter();
        System.out.println(substringRemovePrinter.removeGivenSubstring("las"));
//        System.out.println(wordsWithVowelPrinter.findWordWithVowel());
//        wordsWithSameLetterPrinter.printWordsWithSameLastAndFirstLetterFollowOneAnother();
    }
}




