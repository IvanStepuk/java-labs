package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Hotel hotel1 = new Hotel("Grand Plaza", 5, 250);
        Hotel hotel2 = new Hotel("Sunset Resort", 4, 180);
        Hotel hotel3 = new Hotel("City Inn", 3, 90);
        Hotel hotel4 = new Hotel("Seaside View", 4, 140);
        Hotel hotel5 = new Hotel("Eco Stay", 3, 60);
        System.out.println("Список отелей:");
        System.out.println("1. " + hotel1.getName() + " (" + hotel1.getStars() + " звёзд) — " + hotel1.getRooms() + " номеров");
        System.out.println("2. " + hotel2.getName() + " (" + hotel2.getStars() + " звёзд) — " + hotel2.getRooms() + " номеров");
        System.out.println("3. " + hotel3.getName() + " (" + hotel3.getStars() + " звёзд) — " + hotel3.getRooms() + " номеров");
        System.out.println("4. " + hotel4.getName() + " (" + hotel4.getStars() + " звёзд) — " + hotel4.getRooms() + " номеров");
        System.out.println("5. " + hotel5.getName() + " (" + hotel5.getStars() + " звёзд) — " + hotel5.getRooms() + " номеров");
        System.out.println();
        System.out.println("Общая статистика:");
        System.out.println("Всего отелей: " + Hotel.totalHotels);
        System.out.println("Всего номеров: " + Hotel.totalRooms);
        System.out.println("Среднее количество номеров: " + Hotel.getAverageRooms());
    }
}
