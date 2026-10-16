package org.example;

import java.util.Scanner;

public class                                                                                                                                                                                                                            App
{
    public static void main( String[] args )
    {
        School school1 = new School("Гимназия №1", 600, 11);
        School school2 = new School("Школа №42", 450, 9);
        School school3 = new School("Лицей №10", 300, 4);
        University uni1 = new University("БГУ", 12000, 18);
        University uni2 = new University("БГУИР", 8500, 8);
        Educable[] institutions = new Educable[] {
                school1, school2, school3, uni1, uni2
        };
        System.out.println("Обучение в учебных заведениях");
        for (Educable inst : institutions) {
            inst.educate();
        }
        System.out.println("\nВыпуск студентов/учеников");
        Graduable[] graduables = new Graduable[] {
                school1, school2, school3, uni1, uni2
        };
        for (Graduable grad : graduables) {
            grad.graduate();
        }
        System.out.println("\nИтоговая статистика по выпускникам");
        for (Graduable grad : graduables) {
            if (grad instanceof School) {
                School s = (School) grad;
                System.out.println(s.getName() + " — всего выпускников: " + s.getGraduates());
            } else if (grad instanceof University) {
                University u = (University) grad;
                System.out.println(u.getName() + " — всего выпускников: " + u.getGraduates());
            }
        }
    }
}
