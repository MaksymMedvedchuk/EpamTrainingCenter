package chapter7.variantb;

public class Runner {
    public static void main(String[] args) {
        String input = "\tThe string tokenizer class allows an application to break a string into tokens. " +
                "The tokenization method is much simpler than the one used by the StreamTokenizer class. " +
                "\tThe StringTokenizer methods do not distinguish among identifiers, numbers, and quoted strings, nor do they recognize and skip comments. " +
                "\tA StringTokenizer object internally maintains a current position within the string to be tokenized." +
                "Some operations advance this current position past the characters processed.";

        Text text = Text.getParsText(input);



    }
}
