public class Insurance {
    String number;
    InsuranceType type;
    public Insurance(String number, InsuranceType type) {
        this.number = number;
        this.type = type;
    }
    public void displayInfo() {
        System.out.println("Страховка №: " + number + ", Тип: " + type);
    }
}