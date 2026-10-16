package org.example;

public class InvalidPetDataException extends Exception {
    private final String invalidField;
    public InvalidPetDataException(String message) {
        super(message);
        this.invalidField = "Unknown";
    }
    public InvalidPetDataException(String message, String invalidField) {
        super(message);
        this.invalidField = invalidField;
    }
    public String getInvalidField() {
        return invalidField;
    }
}
