package chapter7.variantb;

import java.util.regex.Pattern;

public abstract class SentencePart {
    protected String content;

    public SentencePart(String content) {
        this.content = content;
    }

    public static SentencePart getSentencePart(String input) {
        if (Pattern.matches("\\p{Punct}", input)) return new Punctuation(input);
        else return new Word(input);
    }

    @Override
    public String toString() {
        return content;
    }
}

