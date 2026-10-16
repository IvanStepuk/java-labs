package org.example;

public class School implements Educable, Graduable {
    private String name;
    private int students;
    private int grades;
    private int graduates;
    public School(String name, int students, int grades) {
        this.name = name;
        this.students = students;
        this.grades = grades;
        this.graduates = 0;
    }
    public String getName() {
        return name;
    }
    public int getGrades() {
        return grades;
    }
    @Override
    public void educate() {
        System.out.println("Школа \"" + getName() + "\" проводит уроки для " + getStudents() + " учеников (классов: " + getGrades() + ").");
    }
    @Override
    public int getStudents() {
        return students;
    }
    @Override
    public void graduate() {
        if (students > 0) {
            int newGraduates = Math.min(30, students);
            students -= newGraduates;
            graduates += newGraduates;
            System.out.println("Школа \"" + getName() + "\" выпустила " + newGraduates + " выпускников! Осталось учеников: " + getStudents());
        } else {
            System.out.println("В школе \"" + getName() + "\" нет учеников для выпуска.");
        }
    }
    @Override
    public int getGraduates() {
        return graduates;
    }
}
