package chapter4.task1;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Word firstWord = new Word("I'm");
        Word secondWord = new Word("studying");
        Word thirdWord = new Word("Java");

        List<Word> wordList = new ArrayList<>();
        wordList.add(firstWord);
        wordList.add(secondWord);
        wordList.add(thirdWord);
    }
}
