package chapter4.variantb.task4.vegetables;

import chapter4.variantb.task4.vegetables.Vegetables;

public class Tomato extends Vegetables {
    public Tomato(int calorie, String color) {
        super(calorie, color);
    }

    @Override
    public int compareTo(Vegetables o) {
        return color.compareTo(o.color);
    }
}
