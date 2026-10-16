package org.example;

public class SportsEquipment {
    private String name;
    private int id;
    private double weight;
    public SportsEquipment(String name, int id, double weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "ID: " + getId() + ", Название: '" + getName() + "', Вес: " + getWeight() + " кг";
    }
}
