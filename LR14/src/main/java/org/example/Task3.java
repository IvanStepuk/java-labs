package org.example;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public void execute() {
        System.out.println("Задание 3");
        String fileF = "f.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";
        Random random = new Random();
        try (FileWriter writerF = new FileWriter(fileF)) {
            for (int i = 0; i < 15; i++) {
                int randomNum = random.nextInt(250) - 50;
                writerF.write(randomNum + " ");
            }
            writerF.flush();
        } catch (IOException e) {
            System.err.println("Ошибка создания файла f: " + e.getMessage());
            return;
        }
        StringBuilder allNumbers = new StringBuilder();
        StringBuilder gNumbers = new StringBuilder();
        StringBuilder hNumbers = new StringBuilder();
        try (FileReader readerF = new FileReader(fileF);
             Scanner fileScanner = new Scanner(readerF);
             FileWriter writerG = new FileWriter(fileG);
             FileWriter writerH = new FileWriter(fileH)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                allNumbers.append(num).append(" ");
                if (num % 2 != 0 && num < 100) {
                    writerG.write(num + " ");
                    gNumbers.append(num).append(" ");
                } else {
                    writerH.write(num + " ");
                    hNumbers.append(num).append(" ");
                }
            }
            writerG.flush();
            writerH.flush();
        } catch (IOException e) {
            System.err.println("Ошибка обработки файлов: " + e.getMessage());
            return;
        }
        System.out.println("Содержимое файла 'f' (исходные случайные числа): " + allNumbers);
        System.out.println("Содержимое файла 'g' (нечётные и < 100): " + gNumbers);
        System.out.println("Содержимое файла 'h' (остальные числа): " + hNumbers);
        System.out.println();
    }
}
