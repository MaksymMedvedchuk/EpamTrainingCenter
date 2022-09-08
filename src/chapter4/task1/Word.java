package chapter4.task1;

import java.util.Objects;

public class Word {
    private String word;

    public Word(String word) {
        setWord(word);
    }

    public void setWord(String word) {
        if (!word.matches("[a-zA-Z\\sa-zA-z]+")) throw new IllegalArgumentException(word + " is not a word!");
                    this.word = word;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word1 = (Word) o;
        return Objects.equals(word, word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }

    @Override
    public String toString() {
        return word;
    }
}
