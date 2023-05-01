package chapter4.variantb.task4;

import chapter4.variantb.task4.vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Salad {

    private final List<Vegetable> vegetableList = new ArrayList<>();

    public void addVegetable(Vegetable vegetable) {
        vegetableList.add(vegetable);
    }

    public int getCalorieCount() {
        int amountCalorie = 0;
        for (Vegetable vegetable : vegetableList) {
            amountCalorie += vegetable.getCalorie();
        }
        return amountCalorie;
    }

    public List<Vegetable> getVegetablesSortByCalorie() {
        return vegetableList
                .stream()
                .sorted(Comparator.comparing(Vegetable::getCalorie))
                .collect(Collectors.toList());
    }

    public List<Vegetable> getVegetablesSortBySalt() {
        return vegetableList
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Vegetable> getVegetablesCalorieBetween(int min, int max) {
        List<Vegetable> list = new ArrayList<>();
        for (Vegetable vegetable : vegetableList) {
            if (min > max) throw new IntervalIncorrectException("Incorrect interval");
            if (vegetable.getCalorie() > min && vegetable.getCalorie() < max) {
                list.add(vegetable);
            }
        }
        return list;
    }

    public List<Vegetable> getVegetableList() {
        return new ArrayList<>(vegetableList);
    }
}
