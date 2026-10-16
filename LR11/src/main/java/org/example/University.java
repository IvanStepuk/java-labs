package org.example;

public class University extends Institution{
    private int facultiesCount;
    public University(String name, String address, int students, int facultiesCount) {
        super(name, address, students);
        setFacultiesCount(facultiesCount);
    }
    @Override
    public String getType() {
        return "Университет";
    }
    public void teach(String subject, String professor) {
        System.out.println("Преподаватель " + professor + " ведет предмет " + subject);
    }
    public int getFacultiesCount() {
        return facultiesCount;
    }
    public void setFacultiesCount(int facultiesCount) {
        this.facultiesCount = facultiesCount;
    }
}
