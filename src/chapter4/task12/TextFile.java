package chapter4.task12;

public class TextFile extends File {
    private String content;

    public TextFile(String name, String content,  Directory parent) {
        super(parent, name);
        this.content = content;
    }

     static TextFile createNewFile(String name, String content, Directory parent){
        return new TextFile(name, content, parent);
    }

    public String renameFile(String name){
        return this.name = new String(name);
    }

    public void addContent(String input){
        content += " " + input;
    }

    @Override
    void printInfo() {
        System.out.println(parent.printPathFile() + "\n" + name + "\n" + content);
    }
}

