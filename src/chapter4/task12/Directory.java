package chapter4.task12;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
    private List<File> children = new ArrayList<>();

    private Directory(String name, Directory parent) {
        super(parent, name);
    }

    static Directory createRootDirectory(String name) {
        return new Directory(name, null);
    }

    static Directory createDirectory(String name, Directory parent) {
        return new Directory(name, parent);
    }

    public void addFile(File file) {
        children.add(file);
        //file.setParent(this);
    }

    public String renameDirectory(String name) {
        return this.name = new String(name);
    }

    public void deleteChild(File file) {
        children.remove(file);
    }

    @Override
    void printInfo() {
        for (File child : children) {
            System.out.println(child.getName());
        }
    }
}


