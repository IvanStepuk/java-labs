package org.example;

public class Saw extends Tool {
    private double bladeLength;
    public Saw(String name, double power, double weight, double bladeLength) {
        super(name, power, weight);
        setBladeLength(bladeLength);
    }
    public double getBladeLength() {
        return bladeLength;
    }
    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }
    @Override
    public void use() {
        System.out.println("Режет материалы");
    }
    @Override
    public String getSafetyClass() {
        return "Класс II";
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Длина лезвия: " + getBladeLength() + " см");
    }
}
