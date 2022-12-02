package chapter10;

import java.util.HashSet;
import java.util.Set;

public class SetHelper<E> {

    public Set<E> intersectSets(Set<E> firstSet, Set<E> secondSet) { //нове
        Set<E> result = new HashSet<>(firstSet);
        result.retainAll(secondSet);
        return result;
    }

    public Set<E> unionSets(Set<E> firstSet, Set<E> secondSet) {
        Set<E> result = new HashSet<>(firstSet);
        result.addAll(secondSet);
        return result;
    }
}

