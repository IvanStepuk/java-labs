class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee emp : employees) {
            System.out.printf("%-15s %15.2f%n", emp.getFullname(), emp.getSalary());
        }
    }
}