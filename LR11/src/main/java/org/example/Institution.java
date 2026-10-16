package org.example;

public class Institution {
    private String name;
    private String address;
    private int students;
    public Institution(String name, String address, int students) {
        setName(name);
        setAddress(address);
        setStudents(students);
    }
    public void teach() {
        System.out.println("Учу");
    }
    public void teach(String subject) {
        System.out.println("Учу предмету " + subject);
    }
    public void teach(int hours) {
        System.out.println("Учу " + hours + " часов");
    }
    public String getType() {
        return "Учебное заведение";
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
}
