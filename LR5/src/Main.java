import java.util.Scanner;

public class Main {
    public static void main(String[] args) {Scanner in = new Scanner(System.in);
        System.out.print("Выберите задание от 1 до 3: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Задание 1: Проверка размера магазина\n");
                Store store1 = new Store("Гиппо", "пр. Партизанский, 150", 65);
                Store store2 = new Store("Соседи", "ул. Ленина, 5", 25);
                System.out.println("Магазин: " + store1.name + " (сотрудников: " + store1.employeeCount + ")");
                System.out.println("Крупный магазин: " + (store1.isLarge() ? "Да" : "Нет"));
                System.out.println();
                System.out.println("Магазин: " + store2.name + " (сотрудников: " + store2.employeeCount + ")");
                System.out.println("Крупный магазин: " + (store2.isLarge() ? "Да" : "Нет"));
                break;
            }
            case 2: {
                System.out.println("Задание 2: Анализ школ в массиве\n");
                School[] schools = new School[] {
                        new School("Гимназия №1", 1200, 85),
                        new School("Школа №45", 850, 60),
                        new School("Лицей №2", 1500, 95),
                        new School("Школа №12", 600, 45),
                        new School("Гимназия №5", 1100, 100)
                };
                School maxStudentsSchool = schools[0];
                School maxTeachersSchool = schools[0];
                for (int i = 1; i < schools.length; i++) {
                    if (schools[i].students > maxStudentsSchool.students) {
                        maxStudentsSchool = schools[i];
                    }
                    if (schools[i].teachers > maxTeachersSchool.teachers) {
                        maxTeachersSchool = schools[i];
                    }
                }
                System.out.println("Школа с максимальным количеством учеников: "
                        + maxStudentsSchool.name + " (" + maxStudentsSchool.students + " учеников)");
                System.out.println("Школа с максимальным количеством учителей: "
                        + maxTeachersSchool.name + " (" + maxTeachersSchool.teachers + " учителей)");
                break;
            }
            case 3: {
                System.out.println("Задание 3: Вывод страховок типа HEALTH\n");
                Insurance[] insurances = new Insurance[] {
                        new Insurance("HL-1001", InsuranceType.HEALTH),
                        new Insurance("LF-2002", InsuranceType.LIFE),
                        new Insurance("CR-3003", InsuranceType.CAR),
                        new Insurance("HL-1004", InsuranceType.HEALTH),
                        new Insurance("PR-4005", InsuranceType.PROPERTY),
                        new Insurance("HL-1006", InsuranceType.HEALTH)
                };
                System.out.println("Найденные страховки типа HEALTH:");
                for (Insurance insurance : insurances) {
                    if (insurance.type == InsuranceType.HEALTH) {
                        insurance.displayInfo();
                    }
                }
                break;
            }
            default: {
                System.out.println("Можно выбрать только от 1 до 3");
            }
        }

    }
}