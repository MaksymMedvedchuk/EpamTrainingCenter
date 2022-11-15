package test;

public class TestRunner {
    public static void main(String[] args) {
        String s = "asdfgh fghf";
        int begin = s.indexOf("s");
        int end = s.lastIndexOf("f");
        String sub = s.substring(begin, end);
        System.out.println(s.replace(sub, ""));

    }


    }







