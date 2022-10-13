package test;

import java.util.StringTokenizer;

public class TestRunner {
    public static void main(String[] args) {
    String string = "live in a house near the mountains. I have two brothers and one sister, and I was born last. " +
            "\tMy father teaches mathematics, and my mother is a nurse at a big hospital. \tMy brothers are very smart and work hard in school.";
        StringTokenizer stringTokenizer = new StringTokenizer(string, "\t");
        while (stringTokenizer.hasMoreElements()) System.out.println(stringTokenizer.nextToken());




    }
}




