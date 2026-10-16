package org.example;

public class University implements Educable, Graduable {
    private String name;
    private int students;
    private int faculties;
    private int graduates;
    public University(String name, int students, int faculties) {
        this.name = name;
        this.students = students;
        this.faculties = faculties;
        this.graduates = 0;
    }
    public String getName() {
        return name;
    }
    public int getFaculties() {
        return faculties;
    }
    @Override
    public void educate() {
        System.out.println("Университет \"" + getName() + "\" читает лекции для " + getStudents() + " студентов на " + getFaculties() + " факультетах.");
    }
    @Override
    public int getStudents() {
        return students;
    }
    @Override
    public void graduate() {
        if (students > 0) {
            int newGraduates = Math.min(150, students);
            students -= newGraduates;
            graduates += newGraduates;
            System.out.println("Университет \"" + getName() + "\" вручил дипломы " + newGraduates + " специалистам! Осталось студентов: " + getStudents());
        } else {
            System.out.println("В университете \"" + getName() + "\" нет студентов для выпуска.");
        }
    }
    @Override
    public int getGraduates() {
        return graduates;
    }
}
