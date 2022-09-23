package chapter4.task12;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
    private List<File> children = new ArrayList<>();


    private Directory(Directory parent, String name) {
        super(parent, name);
    }

    static Directory createNewFolder(Directory parent){
        return new Directory(parent, null);
    }

    public String renameFolder(String folder){
        return this.name = new String(folder);
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    void printInfo() {
        System.out.println(this);
    }
}


