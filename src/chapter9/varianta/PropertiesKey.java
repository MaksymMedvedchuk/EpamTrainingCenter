package chapter9.varianta;

public enum PropertiesKey {

    INPUT_FILE("inputFile"),
    OUTPUT_FILE("outputFile"),
    INPUT_ARCHIVE_FILE("inputArchiveFile");

    private final String key;

    PropertiesKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
