package org.example;

public class Pet {
    private String name;
    private String species;
    private int age;
    private double weight;
    private String owner;
    private boolean inQuarantine;
    public Pet(String name, String species, int age, double weight, String owner) throws InvalidPetDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidPetDataException("Кличка питомца не может быть пустой", "name");
        }
        if (species == null || species.trim().isEmpty()) {
            throw new InvalidPetDataException("Вид питомца не может быть пустым", "species");
        }
        if (age < 0) {
            throw new InvalidPetDataException("Возраст питомца не может быть отрицательным: " + age, "age");
        }
        if (weight <= 0) {
            throw new InvalidPetDataException("Вес питомца должен быть больше 0: " + weight, "weight");
        }
        if (owner == null || owner.trim().isEmpty()) {
            throw new InvalidPetDataException("Имя владельца не может быть пустым", "owner");
        }
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.owner = owner;
        this.inQuarantine = false;
    }
    public void visitVet() throws VetException {
        if (this.inQuarantine) {
            throw new VetException("Питомец находится на карантине, плановый прием невозможен", this.name);
        }
        System.out.println("Питомец " + getName() + " (" + getSpecies() + ") успешно прошел ветеринарный осмотр.");
    }
    public void updateWeight(double newWeight) throws InvalidPetDataException {
        if (newWeight <= 0) {
            throw new InvalidPetDataException("Новый вес должен быть положительным: " + newWeight, "weight");
        }
        System.out.println("Вес питомца " + getName() + " изменен с " + this.weight + " кг на " + newWeight + " кг.");
        this.weight = newWeight;
    }
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public String getOwner() {
        return owner;
    }
    public boolean isInQuarantine() {
        return inQuarantine;
    }
    public void setInQuarantine(boolean inQuarantine) {
        this.inQuarantine = inQuarantine;
    }
    @Override
    public String toString() {
        return "Питомец [Кличка: '" + getName() + "', Вид: '" + getSpecies() + "', Возраст: " + getAge() + ", Вес: " + getWeight() + " кг, Владелец: '" + getOwner() + "']";
    }
}
