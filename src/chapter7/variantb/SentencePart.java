package chapter7.variantb;

public abstract class SentencePart {
    private String word;
    private String punctuation;


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        word = word.trim();
        if (!word.matches("[A-Za-z]+")) throw new IllegalArgumentException("Isn't a word!");
        this.word = word;
    }

    public String getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(String punctuation) {
        if (!punctuation.matches("[^A-Za-z]+")) throw new IllegalArgumentException("Isn't a punctuation!");
        this.punctuation = punctuation;
    }
}
