package chapter4.varianta.task12;

public class Runner {
    public static void main(String[] args) {
        Directory rootDirectory = Directory.createRootDirectory("C:");
        Directory programFiles = Directory.createDirectory("Program Files", rootDirectory);
        Directory java = Directory.createDirectory("Java", programFiles);
        TextFile textFile = TextFile.createNewFile("Java.txt", "Java is a pain", java);
        java.printInfo();
        textFile.printInfo();
        System.out.println(java.getFilePath());
    }
}



