package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Train train = new Train("Минск - Брест", "701Б", "14:30");
        System.out.println("Пункт назначения: " + train.getDestination());
        System.out.println("Номер поезда: " + train.getTrainNumber());
        System.out.println("Время отправления по расписанию: " + train.getDepartureTime());
        int delayMinutes = 30;
        System.out.println("\nПоезд задерживается на " + delayMinutes + " минут");
        train.isDelayed(delayMinutes);
        System.out.println("Обновлённое время отправления: " + train.getDepartureTime());
    }
}
