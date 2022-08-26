package chapter2.variantb.task1;

public class Runner {
    public static void main(String[] args) {
        BelongsIntervalsChecker belongsIntervalsChecker = new BelongsIntervalsChecker();
        belongsIntervalsChecker.printNumbers();
        //цю перевірку можемо і не робити, бо тут при любих буде тру, бо ми зразу робимо перерірку (15 рядок)
    }
}
