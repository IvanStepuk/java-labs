package org.example;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Task1 {
    public void execute() {
        System.out.println("Задание 1");
        File fileobj = new File("animal.txt");
        String animalInfo = "Любимое животное: Собака.\n" +
                "Порода: Шелти.\n" +
                "Описание: Маленькая, длинношёрстная рабочая собака, очень красивая, свободная от неуклюжести и грубости.";
        OutputStream fos = null;
        try {
            fos = new FileOutputStream(fileobj);
            byte[] buf = animalInfo.getBytes(StandardCharsets.UTF_8);
            fos.write(buf);
            fos.flush();
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.err.println("Ошибка закрытия потока: " + e.getMessage());
                }
            }
        }
        System.out.println("Сведения о файле");
        FileInspector.printFileInfo(fileobj);
        System.out.println("Содержимое файла");
        InputStream fis = null;
        try {
            fis = new FileInputStream(fileobj);
            int iosize = fis.available();
            byte[] arr = new byte[iosize];
            if (fis.read(arr) != arr.length) {
                System.err.println("Ошибка чтения данных");
            }
            String content = new String(arr, StandardCharsets.UTF_8);
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.err.println("Ошибка закрытия потока: " + e.getMessage());
                }
            }
        }
        System.out.println();
    }
}
