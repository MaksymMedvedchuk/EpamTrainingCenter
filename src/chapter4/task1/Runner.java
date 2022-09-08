package chapter4.task1;

public class Runner {
    public static void main(String[] args) {
        Word word1 = new Word("    I");
        Word word2 = new Word("study");
        Word word3 = new Word("JAVA    ");
        Word word4 = new Word("  And");
        Word word5 = new Word("drink  ");
        Word word6 = new Word("bear   ");

        Sentence firstSentence = new Sentence();
        firstSentence.addWord(word1);
        firstSentence.addWord(word2);
        firstSentence.addWord(word3);

        Sentence secondSentence = new Sentence();
        secondSentence.addWord(word4);
        secondSentence.addWord(word5);
        secondSentence.addWord(word6);

        Text text = new Text();
        text.addSentence(firstSentence);
        text.addSentence(secondSentence);
        text.setHeader("Header");
        text.printText();
    }
}
