package chapter7.variantb;

public class Runner {
    public static void main(String[] args) {
//        String input = "I, am studying the program it is JAVA.";
        String input = "\tThe string the tokenizer class allows an to application to break a string into tokens." +
                "The tokenization method is much simpler than the one used by the StreamTokenizer class. " +
                "\tThe StringTokenizer methods do not distinguish among identifiers, numbers, and quoted strings, nor do they recognize and skip comments." +
                "\tA StringTokenizer object internally maintains a current position within the string to be tokenized." +
                "Some operations advance this current position past the characters processed.";

        Text text = Text.parseText(input);
        text.hashCode();
        System.out.println(text);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        text.removeWordsOfGivenLengthAndBeginsVowel(6);
        System.out.println(text);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        text.printSentencesOrderIncreasingWords();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
