package org.example;

public class University extends EducationalInstitution {
    private int faculties;
    public University(String name, String address, int students, int faculties) {
        super(name, address, students);
        setFaculties(faculties);
    }
    public int getFaculties() {
        return faculties;
    }
    public void setFaculties(int faculties) {
        this.faculties = faculties;
    }
    @Override
    public String getType() {
        return "Университет";
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество факультетов: " + getFaculties());
    }
    public void holdLecture() {
        System.out.println("В университете \"" + getName() + "\" проходит лекция.");
    }
}
