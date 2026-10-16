package org.example;

public class VetException extends Exception {
    private final String petName;
    public VetException(String message, String petName) {
        super(message);
        this.petName = petName;
    }
    public String getPetName() {
        return petName;
    }
}
