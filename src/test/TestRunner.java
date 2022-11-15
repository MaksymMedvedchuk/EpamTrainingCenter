package test;

public class TestRunner {
    public static void main(String[] args) {
        String s = "asdfgh fghf";
        String sub = s.substring(s.indexOf("s"), s.indexOf("f") + 1);
        System.out.println(s.replace(sub, ""));

    }


    }







