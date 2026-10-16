package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Tool[] tools = new Tool[5];
        tools[0] = new Drill("Дрель Bosch PSB 550", 550, 1.8, 3000);
        tools[1] = new Drill("Ударная дрель Makita HP1630", 710, 2.1, 3200);
        tools[2] = new Drill("Дрель Интерскол Д-10/350ЭR", 350, 1.2, 3000);
        tools[3] = new Saw("Дисковая пила DeWalt DWE560", 1350, 3.7, 18.4);
        tools[4] = new Saw("Торцовочная пила Metabo KS 216 M", 1500, 9.4, 21.6);
        System.out.println("Список инструментов и их классы безопасности\n");
        for (Tool tool : tools) {
            tool.displayInfo();
            System.out.print("Применение: ");
            tool.use();
            System.out.println("Класс безопасности: " + tool.getSafetyClass());
            System.out.println("\n");
        }
    }
}
