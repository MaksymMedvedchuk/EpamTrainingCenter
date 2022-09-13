package chapter4.task12;

public class Runner {
    public static void main(String[] args) {
        Directory directory = new Directory("C:/Program files/Java" );
        TextFile textFile = new TextFile("java.txt", "Java is pain");
        directory.printInfo();
        textFile.printInfo();
    }
}



