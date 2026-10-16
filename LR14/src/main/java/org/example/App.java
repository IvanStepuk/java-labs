package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Task1 task1 = new Task1();
        task1.execute();
        Task2 task2 = new Task2();
        task2.execute(scanner);
        Task3 task3 = new Task3();
        task3.execute();
        Task4 task4 = new Task4();
        task4.execute(scanner);
        Task5 task5 = new Task5();
        task5.execute();
        scanner.close();
    }
}
