package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        EducationalInstitution[] institutions = new EducationalInstitution[5];
        institutions[0] = new School("Гимназия №1", "ул. Ленина, 10", 850, 30);
        institutions[1] = new School("Средняя школа №45", "ул. Мира, 15", 1200, 42);
        institutions[2] = new School("Лицей №3", "пр. Независимости, 50", 600, 20);
        institutions[3] = new University("БГУ", "ул. Лобанка, 14", 25000, 16);
        institutions[4] = new University("БНТУ", "пр. Независимости, 65", 30000, 18);
        for (EducationalInstitution inst : institutions) {
            inst.displayInfo();
            System.out.println("\n");
            if (inst instanceof School) {
                School school = (School) inst;
                school.holdLesson();
            }
            else if (inst instanceof University) {
                University university = (University) inst;
                university.holdLecture();
            }
        }
    }
}
