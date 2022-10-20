package test;

import chapter7.variantb.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class TestRunner {
    public static void main(String[] args) {
        String s = "I am studying the program it is JAVA. So, I want to be a programmer! \tIt is challenging for me.";



        StringTokenizer stringTokenizer = new StringTokenizer(s, "\t");
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextToken());
        }



    }
    public void pars(String string){


    }
}




