package chapter4.variantb.task4.vegetables;

import java.math.BigDecimal;

public class Cucumber extends Vegetable {
    public Cucumber(int calorie, BigDecimal saltContent) {
        super(calorie, saltContent);
    }

    @Override
    public int compareTo(Vegetable o) {
        return saltContent.compareTo(o.saltContent);
    }
}
