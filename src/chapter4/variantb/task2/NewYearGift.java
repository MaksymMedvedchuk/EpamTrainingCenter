package chapter4.variantb.task2;

import chapter4.variantb.task2.sweets.Candy;
import chapter4.variantb.task2.sweets.Sweet;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NewYearGift {

    private final List<Sweet> sweetList = new ArrayList<>();

    public void addSweet(Sweet sweet) {
        sweetList.add(sweet);
    }

    public void printGiftWeight() {
        BigDecimal giftWeight = new BigDecimal(0);
        for (Sweet sweet : sweetList) {
            giftWeight = giftWeight.add(sweet.getWeight());
        }
        System.out.println(this + "\n" + "New Year Gift weight: " + giftWeight);
    }

    public List<Candy> getCandiesSortedByWeight() {
        List<Candy> candyList = new ArrayList<>();
        for (Sweet sweet : sweetList) {
            if (sweet instanceof Candy) {
                candyList.add((Candy) sweet);
            }
        }
        return candyList.stream().sorted(Comparator.comparing(Candy::getWeight)).collect(Collectors.toList());
    }

    public List<Candy> getCandyBySugarBetween(BigDecimal min, BigDecimal max) {
        if (min.compareTo(max) > 0) {
            BigDecimal temp = min;
            min = max;
            max = temp;
        }
        List<Candy> candyList = new ArrayList<>();
        for (Sweet sweet : sweetList) {
            if (sweet instanceof Candy && sweet.getSugarContent().compareTo(min) >= 0
                    && sweet.getSugarContent().compareTo(max) <= 0) {
                candyList.add((Candy) sweet);
            }
        }
        return candyList;
    }

    public List<Sweet> getSweetList() {
        return new ArrayList<>(sweetList);
    }

    @Override
    public String toString() {
        return "NewYearGift{" +
                "sweetList=" + sweetList +
                '}';
    }
}
