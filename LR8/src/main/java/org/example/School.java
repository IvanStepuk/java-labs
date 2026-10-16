package org.example;

public class School extends EducationalInstitution {
    private int grades;
    public School(String name, String address, int students, int grades) {
        super(name, address, students);
        setGrades(grades);
    }
    public int getGrades() {
        return grades;
    }
    public void setGrades(int grades) {
        this.grades = grades;
    }
    @Override
    public String getType() {
        return "Школа";
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество классов: " + getGrades());
    }
    public void holdLesson() {
        System.out.println("В школе \"" + getName() + "\" проходит урок.");
    }
}
