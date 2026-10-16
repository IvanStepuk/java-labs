package org.example;

public class EducationalInstitution {
    private String name;
    private String address;
    private int students;
    public EducationalInstitution(String name, String address, int students) {
        setName(name);
        setAddress(address);
        setStudents(students);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getStudents() {
        return students;
    }
    public void setStudents(int students) {
        this.students = students;
    }
    public String getType() {
        return "Учебное заведение";
    }
    public void displayInfo() {
        System.out.println("Тип: " + getType());
        System.out.println("Название: " + getName());
        System.out.println("Адрес: " + getAddress());
        System.out.println("Количество студентов: " + getStudents());
    }
}
