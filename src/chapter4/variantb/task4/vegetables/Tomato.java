package chapter4.variantb.task4.vegetables;

import java.math.BigDecimal;

public class Tomato extends Vegetable {
    public Tomato(int calorie, BigDecimal saltContent) {
        super(calorie, saltContent);
    }

    @Override
    public int compareTo(Vegetable o) {
        return saltContent.compareTo(o.saltContent);
    }
}
