package chapter4.variantb.task4.vegetables;

import java.math.BigDecimal;

public abstract class Vegetable implements Comparable<Vegetable> {

    protected int calorie;
    protected BigDecimal saltContent;

    public Vegetable(int calorie, BigDecimal saltContent) {
        this.calorie = calorie;
        this.saltContent = saltContent;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public BigDecimal getSaltContent() {
        return saltContent;
    }

    public void setSaltContent(BigDecimal saltContent) {
        this.saltContent = saltContent;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "calorie=" + calorie +
                ", color='" + saltContent + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vegetable o) {
        return saltContent.compareTo(o.saltContent);
    }
}


