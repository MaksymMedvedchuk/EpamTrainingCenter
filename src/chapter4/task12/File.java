package chapter4.task12;

public abstract class File {
    protected Directory parent;
    protected String name;

    public File(String name) {
        this.name = name;
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





