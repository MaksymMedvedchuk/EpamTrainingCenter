package chapter4.task12;

public class Directory extends File {
    private String folder;

    public Directory(String name) {
        super(name);
    }

    public String createNewFolder(String folder){
        return new String(folder);
    }

    public String renameFolder(String folder){
        return this.name = new String(folder);
    }

    public void deleteFolder(){
        this.folder = null;
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


