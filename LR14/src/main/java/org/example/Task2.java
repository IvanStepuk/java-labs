package org.example;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task2 {
    public void execute(Scanner scanner) {
        System.out.println("Задание 2");
        String fileName = "f.txt";
        StringBuilder sb = new StringBuilder();
        System.out.println("Введите 10 целых чисел:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка. Введите целое число: ");
                scanner.next();
            }
            int num = scanner.nextInt();
            sb.append(num).append(" ");
        }
        try (OutputStream fos = new FileOutputStream(fileName)) {
            byte[] data = sb.toString().trim().getBytes(StandardCharsets.UTF_8);
            fos.write(data);
            fos.flush();
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }
        try (InputStream fis = new FileInputStream(fileName)) {
            int size = fis.available();
            byte[] buf = new byte[size];
            fis.read(buf);
            String content = new String(buf, StandardCharsets.UTF_8).trim();
            System.out.println("Считанные числа из файла 'f': " + content);
            String[] parts = content.split("\\s+");
            int count = 0;
            for (String part : parts) {
                if (!part.isEmpty()) {
                    int value = Integer.parseInt(part);
                    if (value % 2 == 0 && value > 10) {
                        count++;
                    }
                }
            }
            System.out.println("Количество чётных чисел, больших 10: " + count);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
        System.out.println();
    }
}
