package chapter9.varianta;

public enum PropertiesKeys {

    INPUT_FILE("inputFile"),
    OUTPUT_FILE("outputFile"),
    INPUT_ARCHIVE_FILE("inputArchiveFile");

    private final String key;

    PropertiesKeys(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
