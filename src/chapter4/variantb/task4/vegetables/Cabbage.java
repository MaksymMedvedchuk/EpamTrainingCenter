package chapter4.variantb.task4.vegetables;

public class Cabbage extends Vegetables {
    private Cabbage(int calorie, String color) {
        super(calorie, color);
    }

    public static Cabbage createCabbage(int calorie, String color) {
        return new Cabbage(calorie, color);
    }

    @Override
    public int compareTo(Vegetables o) {
        return color.compareTo(o.color);
    }
}
