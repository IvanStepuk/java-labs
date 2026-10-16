import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите задание от 1 до 4: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Задание 1: Получить символ по индексу 4\n");
                System.out.print("Введите строку (не менее 5 символов): ");
                String str = in.nextLine();
                if (str.length() > 4) {
                    System.out.println("Символ по индексу 4: " + str.charAt(4));
                } else {
                    System.out.println("Ошибка: длина строки меньше 5 символов");
                }
                break;
            }
            case 2: {
                System.out.println("Задание 2: Найти самое длинное слово в предложении\n");
                System.out.print("Введите предложение: ");
                String sentence = in.nextLine();
                String[] words = sentence.trim().split("[\\s\\p{Punct}]+");
                String longest = "";
                for (String word : words) {
                    if (word.length() > longest.length()) {
                        longest = word;
                    }
                }
                System.out.println("Самое длинное слово: " + longest);
                break;
            }
            case 3: {
                System.out.println("Задание 3: Отчет по зарплате сотрудников\n");
                Employee[] employees = new Employee[] {
                        new Employee("Иванов И.И.", 1250.50),
                        new Employee("Петров П.П.", 980.00),
                        new Employee("Сидоров С.С.", 2100.75),
                        new Employee("Алексеев А.А.", 1550.00)
                };
                Report.generateReport(employees);
                break;
            }
            case 4: {
                System.out.println("Задание 4: Поиск подстрок с нечетными цифрами\n");
                String text = "a1a a22a a333a a4444a a55555a";
                System.out.println("Исходная строка: " + text);
                Pattern pattern = Pattern.compile("a[13579]+a");
                Matcher matcher = pattern.matcher(text);
                System.out.println("Результат:");
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
                break;
            }
            default: {
                System.out.println("Можно выбрать только от 1 до 4");
            }
        }
    }
}
