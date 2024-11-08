package mirea.lab19.p2;

import java.util.Scanner;

public class LabClassUI {
    private LabClass lb;

    public LabClassUI() {
        this.lb = new LabClass();
    }

    public void menu() {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nМеню");
                System.out.println("1 - Добавить студента");
                System.out.println("2 - Сортировать студентов");
                System.out.println("3 - Найти студентов");
                System.out.println("4 - Вывести студентов");
                System.out.println("5 - Выход");
                System.out.print("Введите номер опции: ");
                int o = sc.nextInt();
                switch (o) {
                    case 1:
                        sc.nextLine();
                        System.out.print("\nВведите имя студента: ");
                        String name = sc.nextLine();
                        System.out.print("Введите балл студента: ");
                        int gpa = sc.nextInt();
                        lb.stadd(name, gpa);
                        break;
                    case 2:
                        lb.stsortgpa();
                        System.out.println("Список отсортирован!");
                        break;
                    case 3:
                        System.out.println("Введите имя студента: ");
                        System.out.println(lb.stfind(sc.nextLine()));
                        break;
                    case 4:
                        lb.stlist();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Неверный ввод опции");
                        break;
                }
            }
        }
    }
}
