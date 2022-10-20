package chapter7.variantb;

public class Word extends SentencePart{
    public Word(String content) {
        super(content);
    }

    @Override
    public String toString() {
        return content;
    }
}
