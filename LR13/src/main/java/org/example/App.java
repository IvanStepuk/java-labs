package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        VeterinaryClinic clinic = new VeterinaryClinic("ВетЗабота");
        try {
            Pet dog = new Pet("Барсик", "Собака", 3, 12.5, "Иванов И.И.");
            Pet cat = new Pet("Мурка", "Кошка", 2, 4.1, "Петрова А.С.");
            clinic.registerPet(dog);
            clinic.registerPet(cat);
        } catch (InvalidPetDataException e) {
            System.out.println("Ошибка при создании питомца: " + e.getMessage());
        }
        clinic.displayAllPatients();
        try {
            System.out.println("Попытка создать питомца с отрицательным возрастом:");
            new Pet("Рекс", "Немецкая овчарка", -2, 20.0, "Сидоров В.В.");
        } catch (InvalidPetDataException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage() + " (Поле: " + e.getInvalidField() + ")");
        } finally {
            System.out.println("Операция валидации возраста завершена.");
        }
        try {
            System.out.println("\nПопытка создать питомца с нулевым весом:");
            new Pet("Шарик", "Дворняга", 1, 0, "Ковалев Д.М.");
        } catch (InvalidPetDataException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage() + " (Поле: " + e.getInvalidField() + ")");
        }
        try {
            Pet barsik = clinic.findPet("Барсик");
            barsik.updateWeight(13.2);
            System.out.println("Попытка установить отрицательный вес:");
            barsik.updateWeight(-5.0);
        } catch (PetNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        } catch (InvalidPetDataException e) {
            System.out.println("Ошибка валидации веса: " + e.getMessage());
        }
        try {
            System.out.println("Попытка провести осмотр незарегистрированного питомца \"Бобик\":");
            clinic.conductCheckup("Бобик");
        } catch (PetNotFoundException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
            System.out.println("Не найден пациент с именем: " + e.getPetName());
        } catch (VetException e) {
            System.out.println("Ветеринарная ошибка: " + e.getMessage());
        }
        try {
            Pet murka = clinic.findPet("Мурка");
            murka.visitVet();
            System.out.println("\nПомещение Мурки на карантин и повторная попытка приема:");
            murka.setInQuarantine(true);
            murka.visitVet();
        } catch (PetNotFoundException e) {
            System.out.println("Питомец не найден: " + e.getMessage());
        } catch (VetException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage() + " (Пациент: " + e.getPetName() + ")");
        } finally {
            System.out.println("Журнал приема пациентов сохранен.");
        }
    }
}
