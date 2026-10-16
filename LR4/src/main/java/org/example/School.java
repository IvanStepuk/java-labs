package org.example;

public class School {
    String name;
    int students;
    int teachers;
    public School(String name, int students, int teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }
    public String toString()
    {
        return "Название: " + name + "; Количество студентов: " + students + "; Количество учителей: " + teachers + "\n";
    }
}
