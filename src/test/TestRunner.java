package test;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class TestRunner {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two");
        String s = list.stream().collect(Collectors.joining(" ", "" , "."));
        System.out.println(s);










    }


}




