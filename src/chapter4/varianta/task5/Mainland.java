package chapter4.varianta.task5;

public class Mainland {
    private String name;

    public Mainland(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
