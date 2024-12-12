package ru.mirea.practice.s0000001;
import java.util.regex.*;
import java.util.Scanner;
// Задания№1-5
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = sc.nextLine();

        System.out.println("Пожалуйста, выберите действие:");
        System.out.println("1. Проверить строку на соответствие шаблону 'abcdefghijklmnopqrstuv18340'");
        System.out.println("2. Извлечь цены в USD, RUB, EUR");
        System.out.println("3. Проверить наличие чисел без знака '+'");
        System.out.println("4. Проверить, является ли строка датой в формате dd/mm/yyyy");
        System.out.println("5. Проверить корректность e-mail");
        System.out.println("6. Проверить надежность пароля");

        int choice = sc.nextInt();
        sc.nextLine(); // Очистка ввода
        switch (choice) {
            case 1:
                Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
                boolean match1 = p1.matcher(input).matches();
                System.out.println(match1 ? "Соответствует шаблону^'^" : "Не соответствует шаблону^-^");
                break;
            case 2:
                Pattern p2 = Pattern.compile("\\d+\\.\\d{2}\\s?(USD|RUB|EUR)");
                Matcher m2 = p2.matcher(input);
                while (m2.find()) {
                    System.out.println("Цена: " + m2.group());
                }
                break;
            case 3:
                Pattern p3 = Pattern.compile("\\d(?!\\+)");
                Matcher m3 = p3.matcher(input);
                while (m3.find()) {
                    System.out.println("Число без '+': " + m3.group());
                }
                break;
            case 4:
                Pattern p4 = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$");
                boolean match4 = p4.matcher(input).matches();
                System.out.println(match4 ? "Корректная дата" : "Некорректная дата:(");
                break;
            case 5:
                Pattern p5 = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
                boolean match5 = p5.matcher(input).matches();
                System.out.println(match5 ? "Корректный e-mail" : "Некорректный e-mail:(");
                break;
            case 6:
                Pattern p6 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$");
                boolean match6 = p6.matcher(input).matches();
                System.out.println(match6 ? "Надежный пароль" : "Ненадежный пароль:(");
                break;
            default:
                System.out.println("Некорректный выбор:(");
        }
        sc.close();
    }
}
