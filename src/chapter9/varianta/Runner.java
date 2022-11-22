package chapter9.varianta;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {
        SubstringRemove substringRemove = new SubstringRemove();
        WordsWithVowel wordsWithVowel = new WordsWithVowel();
        WordsWithSameLetter wordsWithSameLetter = new WordsWithSameLetter();
        System.out.println(substringRemove.removeGivenSubstring("las"));
        System.out.println(wordsWithVowel.findWordWithVowel());
        wordsWithSameLetter.printWordsWithSameLastAndFirstLetterFollowOneAnother();
    }
}




