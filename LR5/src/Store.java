public class Store {
    String name;
    String address;
    int employeeCount;
    public Store(String name, String address, int employeeCount) {
        this.name = name;
        this.address = address;
        this.employeeCount = employeeCount;
    }
    public boolean isLarge() {
        return this.employeeCount > 50;
    }
}