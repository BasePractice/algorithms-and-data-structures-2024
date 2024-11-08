package mirea.lab19.p1;

import java.util.Scanner;

public abstract class Prac19p1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите ФИО: ");
            String name = sc.nextLine();
            System.out.print("\nВведите ИНН: ");
            String inn = sc.nextLine();
            if (inn == null || !inn.matches("\\d{10}")) {
                throw new InnException("Введён неверный ИНН: " + inn);
            }
            System.out.printf("\nЗаказ успешно создан для:\n%s\nИНН: %s", name, inn);
        }
    }
}
