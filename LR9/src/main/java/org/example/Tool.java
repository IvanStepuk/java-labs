package org.example;

public abstract class Tool {
    private String name;
    private double power;
    private double weight;
    public Tool(String name, double power, double weight) {
        setName(name);
        setPower(power);
        setWeight(weight);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract void use();
    public abstract String getSafetyClass();
    public void displayInfo() {
        System.out.println("Инструмент: " + getName() + " | Мощность: " + getPower() + " Вт | Вес: " + getWeight() + " кг");
    }
}
