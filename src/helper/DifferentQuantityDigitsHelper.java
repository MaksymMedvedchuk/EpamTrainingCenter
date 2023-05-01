package helper;

import java.util.HashSet;
import java.util.Set;

public class DifferentQuantityDigitsHelper {

    public int getDifferentDigitsQuantity(String input) {
        Set<Character> differentNumbers = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            differentNumbers.add(input.charAt(i));
        }
        return differentNumbers.size();
    }
}
