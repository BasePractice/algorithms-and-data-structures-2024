package ru.mirea.practice.s23L0908;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        // Задание 1
        System.out.println("\nТест первого задания:");
        Author author = new Author("Тимофей Мясников", "mtimofeym@yandex.ru", 'M');
        System.out.println(author);
        author.setEmail("t123ikle@gmail.com");
        System.out.println("Новая почта: " + author.getEmail());

        // Задание 2
        System.out.println("\nТест второго задания:");
        Ball ball1 = new Ball(1.2, 3.4);
        System.out.println("Координаты первого мяча: " + ball1);
        Ball ball2 = new Ball();
        System.out.println("Координаты второго мяча: " + ball2);
        ball2.setXY(5.6, 7.8);
        System.out.println("Координаты первого мяча после изменения: " + ball2);
        ball1.move(1.0, -1.0);
        System.out.println("Координаты второго мяча после изменения: " + ball1);

        // Задание 3
        System.out.println("\nТест третьего задания:");
        Test3 tester = new Test3(3);
        Point center1 = new Point(1.0, 2.0);
        Circle circle1 = new Circle(center1, 5.0);
        Point center2 = new Point(3.0, 4.0);
        Circle circle2 = new Circle(center2, 10.0);
        tester.addCircle(circle1);
        tester.addCircle(circle2);
        tester.displayCircles();

        // Задание 4
        System.out.println("\nТест четвёртого задания:");
        Shop shop = new Shop();
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("1. Добавить компьютер");
                System.out.println("2. Удалить компьютер");
                System.out.println("3. Отобразить все");
                System.out.println("4. Выйти");
                System.out.print("Выберете действие: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Введите имя компьютера для добавления: ");
                        String nameToAdd = scanner.nextLine();
                        shop.addComputer(new Computer(nameToAdd));
                        break;
                    case 2:
                        System.out.print("Введите имя компьютера для удаления: ");
                        String nameToRemove = scanner.nextLine();
                        shop.removeComputer(nameToRemove);
                        break;
                    case 3:
                        shop.displayComputers();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Действие некорректно");
                        continue;  // Продолжить цикл при некорректном вводе
                }
                if (choice == 4) {
                    break;
                }
            }
        }
        // Задание 5
        System.out.println("\nТест пятого задания:");
    }
}
