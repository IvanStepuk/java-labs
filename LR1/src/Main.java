//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.print("Выберите задание от 1 до 3: ");
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    switch (a)
    {
        case 1:
        {
            System.out.println("Перевод из градусов Фаренгейта в градусы Цельсия");
            System.out.print("Введите количество градусов Фаренгейта: ");
            double c = (in.nextDouble() - 32) / 1.8;
            System.out.println(c + " градусов Цельсия");
            break;
        }
        case 2:
        {
            System.out.println("Конвертер валют");
            System.out.print("Введите сумму (BYN): ");
            double sum = in.nextDouble();
            System.out.print("Введите валюту от 1 до 3 (1 - USD; 2 - EUR; 3 - RUB): ");
            int val = in.nextInt();
            switch (val)
            {
                case 1:
                {
                    System.out.println(sum + " = " + sum / 3 + " USD");
                    break;
                }
                case 2:
                {
                    System.out.println(sum + " = " + sum / 3.6 + " EUR");
                    break;
                }
                case 3:
                {
                    System.out.println(sum + " = " + sum * 28 + " RUB");
                    break;
                }
            }
            break;
        }
        case 3:
        {
            System.out.println("Найти сумму чётных чисел от A до B");
            System.out.print("Введите A: ");
            int aa = in.nextInt();
            System.out.print("Введите B: ");
            int bb = in.nextInt();
            int sum = 0;
//            for(int i = aa; i < bb; i++)
//            {
//                if(i % 2 == 0) sum+=i;
//            }
            int i = aa;
            while (i <= bb)
            {
                if(i % 2 == 0) sum+=i;
                i++;
            }
            System.out.println("Сумма чётных чисел: " + sum);
            break;
        }
        default:
        {
            System.out.println("Можно выбрать только в диапазоне от 1 до 3");
        }
    }
}
