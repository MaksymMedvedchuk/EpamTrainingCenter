package test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class TestRunner {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(2);
        s1.add(7);
        s1.add(1);
        System.out.println("Set1: " + s1);
        List list = Arrays.asList(1, 7, 6, 8);
        Set<Integer> s2 = new HashSet<>(list);
        System.out.println("Set2: " + s2);
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println("Intersection: " + intersection);


    }


}







