package chapter7.variantb;

public class Runner {
    public static void main(String[] args) {
//        String input = "I am stuidying. The program niti os JAVA";
        String input = "\tThe, string the tokenizer class allows an to application to break a string into tokens." +
                "The tokenization method is much simpler than the one used by the StreamTokenizer class. " +
                "\tThe StringTokenizer methods do not distinguish among identifiers, numbers, and quoted strings, nor do they recognize and skip comments." +
                "\tA StringTokenizer object internally maintains a current position within the string to be tokenized." +
                "Some operations advance this current position past the characters processed.";

        Text text = Text.parseText(input);
//        text.hashCode();
//        System.out.println(text);
//        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        text.removeWordsOfGivenLengthAndBeginsVowel(6);
//        System.out.println(text);
//        Text text1 = Text.parseText(input);
//        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        text1.printSentencesOrderIncreasingWords();
//        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        text.swapFirstAndLastSentenceWords();
//        System.out.println(text);
//        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        text.printWordsAlphabeticalOrderByFirstLetter();
//        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        text.sortByGivenLetter("i");
//        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        text.sortWordsAlphabeticalOrderByFirstLetter();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        text.isPalindrome(input);




    }
}
