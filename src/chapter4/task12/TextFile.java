package chapter4.task12;

public class TextFile extends File {
    private String content;

    public TextFile(String name, String content) {
        super(name);
        this.content = content;
    }

    public String createNewFile(String name){
        return new String(name);
    }

    public String renameFile(String name){
        return this.name = new String(name);
    }

    public void addContent(String input){
        content += " " + input;
    }

    public void removeFile(){
        super.name = null;
        this.content = null;
    }

    @Override
    public String toString() {
        return name + "\n" + content;
    }

    @Override
    void printInfo() {
        System.out.println(this);
    }
}

