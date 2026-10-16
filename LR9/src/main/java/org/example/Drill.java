package org.example;

public class Drill extends Tool {
    private int speed;
    public Drill(String name, double power, double weight, int speed) {
        super(name, power, weight);
        setSpeed(speed);
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public void use() {
        System.out.println("Сверлит отверстия");
    }
    @Override
    public String getSafetyClass() {
        return "Класс I";
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Скорость вращения: " + getSpeed() + " об/мин");
    }
}
