package chapter4.task12;

public abstract class File {
    protected Directory parent;
    protected String name;

    public File(Directory parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    public File(Directory parent) {
        this.parent = parent;
    }

    abstract void printInfo();

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}





