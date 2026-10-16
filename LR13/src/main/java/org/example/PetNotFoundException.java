package org.example;

public class PetNotFoundException extends Exception {
    private final String petName;
    public PetNotFoundException(String message, String petName) {
        super(message);
        this.petName = petName;
    }
    public String getPetName() {
        return petName;
    }
}
