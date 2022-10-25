package chapter7.variantb;

public enum Delimiter {

    SENTENCE_PART_SPACE(" "),
    SENTENCE_PART_DOT("."),
    SENTENCE_PART_DELIMITER(" ,:;"),
    SENTENCE_DELIMITER(".!"),
    PARAGRAPH_DELIMITER("\t\n"),
    ;

    private final String delimiter;

    Delimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }
}


