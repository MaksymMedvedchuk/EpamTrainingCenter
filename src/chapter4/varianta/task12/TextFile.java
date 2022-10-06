package chapter4.varianta.task12;

public class TextFile extends File {
    private String content;

    public TextFile(String name, String content,  Directory parent) {
        super(parent, name);
        this.content = content;
    }

     static TextFile createNewFile(String name, String content, Directory parent){
        return new TextFile(name, content, parent);
    }

    public void addContent(String input){
        content += " " + input;
    }

    @Override
    void printInfo() {
        System.out.println(content);
    }
}

