package ru.mirea.practice.s23L0908.prog10;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        try (Scanner scanner = new Scanner(System.in)) {
            // Ввод данных о компьютерах
            while (true) {
                System.out.println("Введите 1, чтобы добавить компьютер, 2, чтобы удалить, 3, чтобы найти"
                        + " компьютер по марке, 4, чтобы найти конкретный компьютер, 5, чтобы выйти.");
                int choice = scanner.nextInt();
                scanner.nextLine(); // считываем символ перехода строки

                switch (choice) {
                    case 1:
                        shop.addComputer(shop.inputComputerData(scanner));
                        break;
                    case 2:
                        shop.removeComputer(shop.inputComputerData(scanner));
                        break;
                    case 3:
                        System.out.println("Введите марку компьютера для поиска:");
                        String brandName = scanner.nextLine();
                        ComputerBrand brand = ComputerBrand.valueOf(brandName);
                        shop.findComputer(brand);
                        break;
                    case 4:
                        System.out.println("Поиск конкретного компьютера");
                        shop.findcertainComputer(shop.inputComputerData(scanner));
                        break;
                    case 5:
                        System.out.println("Выход из программы.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте еще раз.");
                        break;
                }
            }
        }
    }
}
