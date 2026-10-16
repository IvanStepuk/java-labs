import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите задание от 1 до 2: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Проверить, является ли массив убывающим\n");
                System.out.print("Введите размер массива: ");
                int n = in.nextInt();
                int[] mas = new int[n];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < n; i++) {
                    mas[i] = in.nextInt();
                }
                boolean isDecreasing = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] <= mas[i + 1]) {
                        isDecreasing = false;
                        break;
                    }
                }
                if (isDecreasing) {
                    System.out.println("Массив является убывающим");
                } else {
                    System.out.println("Массив не является убывающим");
                }
                break;
            }
            case 2: {
                System.out.println("Поменять местами строку и столбец на месте минимального элемента\n");
                System.out.print("Введите размер квадратной матрицы: ");
                int n = in.nextInt();
                int[][] matrix = new int[n][n];
                System.out.println("Введите элементы матрицы:");
                for (int i = 0; i < matrix.length - 1; i++) {
                    for (int j = 0; j < matrix[1].length - 1; j++) {
                        matrix[i][j] = in.nextInt();
                    }
                }
                System.out.println("Исходная матрица");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(matrix[i][j] + "\t");;
                    }
                    System.out.println();
                }
                int min = Integer.MAX_VALUE;
                int minI = 0;
                int minJ = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (matrix[i][j] < min) {
                            min = matrix[i][j];
                            minI = i;
                            minJ = j;
                        }
                    }
                }
                System.out.println("Минимальный элемент: " + min + " (строка " + minI + ", столбец " + minJ + ")");
                int[] temp = new int[n];
                for (int k = 0; k < n; k++) {
                    temp[k] = matrix[minI][k];
                }
                for (int k = 0; k < n; k++) {
                    matrix[minI][k] = matrix[k][minJ];
                }
                for (int k = 0; k < n; k++) {
                    matrix[k][minJ] = temp[k];
                }
                System.out.println("Матрица после обмена");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;
            }
            default: {
                System.out.println("Можно выбрать только 1 или 2");
            }
        }
    }
}