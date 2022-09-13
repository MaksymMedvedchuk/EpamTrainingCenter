package chapter4.task1;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Objects;

public class Word {
    private String word;
    
    public Word(String word) {
        setWord(word);
    }

    public Word makeFirstLetterUpperCase() {
        return new Word(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
    }

    public Word makeAllLettersLowerCase() {
        return new Word(word.toLowerCase());
    }

    public void setWord(String word) {
        word = word.trim();
        if (!word.matches("[a-zA-z]+")) throw new IllegalArgumentException(word + " is not a word!");
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
