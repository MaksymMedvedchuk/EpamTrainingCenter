package chapter10;

import java.util.*;

public class SetChecker {

    public void defineIntersectionSets(Set firstSet, Set secondSet){
        Set<String> set1 = new HashSet<>();
        for (Object o : firstSet) {
            set1.add((String) o);
        }
        Set<String> set2  = new HashSet<>();
        for (Object o : secondSet) {
            set2.add((String) o);
        }

        set1.retainAll(set2);
        System.out.println(set1);








        }






    }

