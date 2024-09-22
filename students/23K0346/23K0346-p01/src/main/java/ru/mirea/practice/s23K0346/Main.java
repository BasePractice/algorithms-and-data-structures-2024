import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 3: Инициализация массива и подсчёт суммы и среднего арифметического.");
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;
        for (int i = 0; i < numbers1.length; i++) {
            sum1 += numbers1[i];
        }
        double average = (double) sum1 / numbers1.length;
        System.out.println("Сумма: " + sum1);
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("-------------------------------------");

        System.out.println("Задача 4: Ввод массива, подсчёт суммы, нахождение минимального и максимального элементов.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers2 = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            numbers2[i] = scanner.nextInt();
        }

        int sum2 = 0, min = numbers2[0], max = numbers2[0];
        int i = 0;
        do {
            sum2 += numbers2[i];
            if (numbers2[i] < min) {
                min = numbers2[i];
            }
            if (numbers2[i] > max) {
                max = numbers2[i];
            }
            i++;
        } while (i < n);

        System.out.println("Сумма: " + sum2);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("-------------------------------------");

        System.out.println("Задача 5: Вывод аргументов командной строки.");
        for (int j = 0; j < args.length; j++) {
            System.out.println("Аргумент " + j + ": " + args[j]);
        }
        System.out.println("-------------------------------------");

        System.out.println("Задача 6: Первые 10 чисел гармонического ряда.");
        System.out.printf("%-10s %-10s\n", "N", "Harmonic Number");
        for (int j = 1; j <= 10; j++) {
            double harmonic = 0.0;
            for (int k = 1; k <= j; k++) {
                harmonic += 1.0 / k;
            }
            System.out.printf("%-10d %-10.5f\n", j, harmonic);
        }
        System.out.println("-------------------------------------");

        System.out.println("Задача 7: Вычисление факториала.");
        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();
        System.out.println("Факториал " + number + " = " + calculateFactorial(number));
    }

    public static long calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}