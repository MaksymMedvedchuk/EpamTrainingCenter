package Chapter_1;
//Отобразить в окне консоли аргументы командной строки в обратном
//порядке

public class ReverseOrder {


    public static void main(String args[]) {
        StringBuffer buffer = new StringBuffer("First Second");
        buffer.reverse();
        System.out.println(buffer);
    }
}

