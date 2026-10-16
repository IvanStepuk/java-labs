package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class VeterinaryClinic {
    private final String clinicName;
    private final List<Pet> patients;
    public VeterinaryClinic(String clinicName) {
        this.clinicName = clinicName;
        this.patients = new ArrayList<>();
    }
    public void registerPet(Pet pet) {
        if (pet != null) {
            patients.add(pet);
            System.out.println("Питомец " + pet.getName() + " успешно зарегистрирован в клинике \"" + clinicName + "\".");
        }
    }
    public Pet findPet(String name) throws PetNotFoundException {
        Iterator<Pet> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Pet pet = iterator.next();
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        throw new PetNotFoundException("Питомец с кличкой \"" + name + "\" не найден в базе клиники.", name);
    }
    public void conductCheckup(String petName) throws PetNotFoundException, VetException {
        Pet pet = findPet(petName);
        pet.visitVet();
    }
    public void displayAllPatients() {
        System.out.println("\nСписок пациентов клиники \"" + clinicName + "\"");
        if (patients.isEmpty()) {
            System.out.println("Пациентов нет.");
            return;
        }
        Iterator<Pet> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Pet p = iterator.next();
            System.out.println(p);
        }
    }
}
