package Chapter_1;
//Вывести заданное количество случайных чисел с переходом и без перехода
//на новую строку
public class RandomNumbers {
    public static void main(String[] args) {
        int x = 0;
        int y = 250;
        for (int i = 0; i < 10; i++) {
            int randomNumber = x + (int) (Math.random() * y);
            System.out.print(" " + randomNumber);
        }
    }
}
