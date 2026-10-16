package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Institution institution = new Institution("Центр образования", "ул. Ленина, 10", 500);
        institution.teach();
        institution.teach("Информатика");
        institution.teach(120);
        Institution school = new School("Гимназия №1", "ул. Школьная, 5", 800, 1);
        Institution university = new University("Белорусский государственный университет", "пр. Независимости, 4", 15000, 16);
        Institution[] institutions = { institution, school, university };
        for (Institution inst : institutions) {
            System.out.println("Наименование: " + inst.getName() + " | Тип: " + inst.getType());
        }
        for (Institution inst : institutions) {
            if (inst instanceof School) {
                School s = (School) inst;
                s.holdEvent("Праздничный концерт", 45);
            } else if (inst instanceof University) {
                University u = (University) inst;
                u.teach("Программирование", "профессор Иванов");
            }
        }
    }
}
