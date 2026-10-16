package org.example;

public class School extends Institution{
    private int schoolNumber;
    public School(String name, String address, int students, int schoolNumber) {
        super(name, address, students);
        setSchoolNumber(schoolNumber);
    }
    @Override
    public String getType() {
        return "Школа";
    }
    public void holdEvent(String eventName) {
        System.out.println("В школе №" + getSchoolNumber() + " проходит мероприятие: " + eventName);
    }
    public void holdEvent(String eventName, int durationMinutes) {
        System.out.println("В школе №" + getSchoolNumber() + " проходит " + eventName + " длительностью " + durationMinutes + " мин.");
    }
    public int getSchoolNumber() {
        return schoolNumber;
    }
    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }
}
