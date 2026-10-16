package org.example;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {
    public void execute() {
        System.out.println("Задание 5");
        String fileName = "f.txt";
        int[] numbers = {5, 10, 24, 58, 90, 91, -15, 42, 77, 120};
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int num : numbers) {
                writer.write(num + " ");
            }
            writer.flush();
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл f: " + e.getMessage());
            return;
        }
        int countInRange = 0;
        StringBuilder readNumbers = new StringBuilder();
        try (FileReader reader = new FileReader(fileName);
             Scanner fileScanner = new Scanner(reader)) {

            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                readNumbers.append(num).append(" ");
                if (num >= 10 && num <= 90) {
                    countInRange++;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла f: " + e.getMessage());
            return;
        }
        System.out.println("Числа в файле 'f': " + readNumbers);
        System.out.println("Количество чисел в диапазоне от 10 до 90: " + countInRange);
        System.out.println();
    }
}
