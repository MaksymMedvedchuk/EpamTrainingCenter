package chapter4.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class File {
    protected Directory parent;
    protected String name;

    public File(Directory parent, String name) {
        this.parent = parent;
        this.name = name;
        //if (parent != null) parent.addFile(this);
    }

    abstract void printInfo();

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public void delete() {
        parent.deleteChild(this);
        this.parent = null;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String printPathFile() {
        List<String> pathName = new ArrayList<>();
        pathName.add(name);
        Directory directoryParent = parent;
        while (directoryParent != null) {
            pathName.add(directoryParent.getName());
            directoryParent = directoryParent.getParent();
        }

        Collections.reverse(pathName);
        return String.join("\\", pathName);
    }

    @Override
    public String toString() {
        return name;
    }
}






