package chapter4.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Sentence {
    private final List<Word> wordList = new ArrayList<>();

    public void addWord(Word word) {
        wordList.add(word);
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
        //в самому Word лежить String, а joining працює зі String, навіщо map?
        StringJoiner joiner = new StringJoiner(" ", "", ".");
        for (Word word : wordList) {
            String toString = word.toString();
            joiner.add(toString);
        }
        return joiner.toString();
    }
}



