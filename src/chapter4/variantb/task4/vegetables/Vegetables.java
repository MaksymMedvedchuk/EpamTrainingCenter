package chapter4.variantb.task4.vegetables;

public abstract class Vegetables implements Comparable<Vegetables> {

    protected int calorie;
    protected String color;

    public Vegetables(int calorie, String color) {
        this.calorie = calorie;
        this.color = color;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "calorie=" + calorie +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vegetables o) {
        return color.compareTo(o.color);
    }
}


