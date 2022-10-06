package chapter4.varianta.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class Sentence {
    private final List<Word> wordList = new ArrayList<>();

    public void addWord(Word word) {
        wordList.add(wordList.isEmpty() ? word.makeFirstLetterUpperCase() : word.makeAllLettersLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;
        Sentence sentence = (Sentence) o;
        return wordList.equals(sentence.wordList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordList);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ", "", ".");
        wordList.stream().map(Word::toString).forEach(joiner::add);
        return joiner.toString();
    }
}



