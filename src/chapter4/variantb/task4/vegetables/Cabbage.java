package chapter4.variantb.task4.vegetables;

import java.math.BigDecimal;

public class Cabbage extends Vegetable {

    public Cabbage(int calorie, BigDecimal saltContent) {
        super(calorie, saltContent);
    }

    public static Cabbage createCabbage(int calorie, BigDecimal saltContent) {
        return new Cabbage(calorie, saltContent);
    }

    @Override
    public int compareTo(Vegetable o) {
        return saltContent.compareTo(o.saltContent);
    }
}
