package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания (1 или 2): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Задание 1\n");
                System.out.println();
                Map<String, SportsEquipment> equipmentMap = new LinkedHashMap<>();
                Ball ball1 = new Ball("Футбольный мяч Telstar", 101, 0.43, "Футбол");
                Ball ball2 = new Ball("Баскетбольный мяч Spalding", 102, 0.62, "Баскетбол");
                Ball ball3 = new Ball("Волейбольный мяч Mikasa", 103, 0.27, "Волейбол");
                equipmentMap.put(ball1.getName(), ball1);
                equipmentMap.put(ball2.getName(), ball2);
                equipmentMap.put(ball3.getName(), ball3);
                Racket racket1 = new Racket("Теннисная ракетка Wilson Pro", 201, 0.31, 25.0);
                Racket racket2 = new Racket("Бадминтонная ракетка Yonex Astrox", 202, 0.08, 11.5);
                Racket racket3 = new Racket("Ракетка для сквоша Head Speed", 203, 0.13, 13.0);
                equipmentMap.put(racket1.getName(), racket1);
                equipmentMap.put(racket2.getName(), racket2);
                equipmentMap.put(racket3.getName(), racket3);
                Helmet helmet1 = new Helmet("Хоккейный шлем Bauer Re-Akt", 301, 0.60, "L");
                Helmet helmet2 = new Helmet("Велосипедный шлем Specialized Align", 302, 0.35, "M");
                equipmentMap.put(helmet1.getName(), helmet1);
                equipmentMap.put(helmet2.getName(), helmet2);
                System.out.println("Список спортивного инвентаря в Map (Всего элементов: " + equipmentMap.size() + "):");
                Iterator<Map.Entry<String, SportsEquipment>> mapIterator = equipmentMap.entrySet().iterator();
                while (mapIterator.hasNext()) {
                    Map.Entry<String, SportsEquipment> entry = mapIterator.next();
                    System.out.println("Ключ (название): [" + entry.getKey() + "]");
                    System.out.println("Значение: " + entry.getValue());
                }
                break;
            case 2:
                System.out.print("Задание 2\n");
                System.out.println();
                List<Museum> museums = new ArrayList<>();
                museums.add(new Museum(1, "Эрмитаж", "Санкт-Петербург", 4, new ArrayList<>(Arrays.asList(5, 5, 4, 5, 5))));
                museums.add(new Museum(2, "Краеведческий музей", "Тверь", 2, new ArrayList<>(Arrays.asList(3, 2, 3, 2))));
                museums.add(new Museum(3, "Третьяковская галерея", "Москва", 4, new ArrayList<>(Arrays.asList(5, 4, 5, 5))));
                museums.add(new Museum(4, "Музей ретро-авто", "Казань", 3, new ArrayList<>(Arrays.asList(4, 3, 4, 3))));
                museums.add(new Museum(5, "Исторический музей", "Москва", 3, new ArrayList<>(Arrays.asList(4, 4, 5, 4))));
                museums.add(new Museum(6, "Музей восковых фигур", "Сочи", 2, new ArrayList<>(Arrays.asList(2, 3, 2, 1))));
                System.out.println("Исходный список музеев:");
                Iterator<Museum> itInitial = museums.iterator();
                while (itInitial.hasNext()) {
                    System.out.println(itInitial.next());
                }
                System.out.println("\nМузеи со средним рейтингом > 3");
                Iterator<Museum> itAvg = museums.iterator();
                while (itAvg.hasNext()) {
                    Museum m = itAvg.next();
                    if (m.getAverageRating() > 3.0) {
                        System.out.println(m);
                    }
                }
                System.out.println("\nПовышение звездности (для среднего рейтинга >= 4)");
                Iterator<Museum> itStars = museums.iterator();
                while (itStars.hasNext()) {
                    Museum m = itStars.next();
                    if (m.getAverageRating() >= 4.0) {
                        int oldStars = m.getStars();
                        m.setStars(oldStars + 1);
                        System.out.println("Музею '" + m.getName() + "' повышена звездность с " + oldStars + " до " + m.getStars());
                    }
                }
                System.out.println("\nПечать музеев со звездностью 5");
                printMuseums(museums, 5);
                museums.sort((m1, m2) -> {
                    int ratingCompare = Double.compare(m2.getAverageRating(), m1.getAverageRating());
                    if (ratingCompare != 0) {
                        return ratingCompare;
                    }
                    return m1.getName().compareToIgnoreCase(m2.getName());
                });
                System.out.println("\nОтсортированные музеи (ID, название, средний рейтинг)");
                Iterator<Museum> itSorted = museums.iterator();
                while (itSorted.hasNext()) {
                    Museum m = itSorted.next();
                    System.out.printf("ID: %-2d | Название: %-23s | Средний рейтинг: %.2f%n",
                            m.getId(), m.getName(), m.getAverageRating());
                }
                break;
            default:
                System.out.println("Неверный номер задания");
                break;
        }
        scanner.close();
    }
    public static void printMuseums(List<Museum> museums, int stars) {
        boolean found = false;
        Iterator<Museum> iterator = museums.iterator();
        while (iterator.hasNext()) {
            Museum museum = iterator.next();
            if (museum.getStars() == stars) {
                System.out.println(museum);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Музеев со звездностью " + stars + " не найдено.");
        }
    }
}
