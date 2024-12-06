package ru.mirea.practice.s23l0908.task10;

import java.util.Scanner;

public final class Tester {

    private Tester() {
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter number of Computers: ");
            int n = in.nextInt();
            Shop shop = new Shop(n);
            int menu;
            do {
                System.out.println("1. Add Computer");
                System.out.println("2. Delete Computer");
                System.out.println("3. Search Computer");
                menu = in.nextInt();
                switch (menu) {
                    case 1: {
                        System.out.println("Enter information of computer: ");
                        System.out.println("Brand: 1. Acer, 2. Asus, 3. Lenovo, 4. Gigabyte");
                        System.out.print("Please choose: ");
                        int choose = in.nextInt();
                        String brand = null;
                        if (choose == 1) {
                            brand = Brand.Acer.toString();
                        } else if (choose == 2) {
                            brand = Brand.Asus.toString();
                        } else if (choose == 3) {
                            brand = Brand.Lenovo.toString();
                        } else if (choose == 4) {
                            brand = Brand.Gigabyte.toString();
                        }

                        // Move variable declarations closer to usage
                        System.out.print("Ram of memory: ");
                        final int ram = in.nextInt();

                        System.out.print("Rom of memory: ");
                        final int rom = in.nextInt();

                        System.out.print("Hz of monitor: ");
                        final int hz = in.nextInt();

                        System.out.print("Size of monitor: ");
                        final int size = in.nextInt();

                        System.out.print("Panel of monitor: ");
                        in.nextLine();  // Consume newline
                        final String panel = in.nextLine();

                        System.out.print("Clock speed of processor: ");
                        final double clockSpeed = in.nextDouble();

                        System.out.print("Core of processor: ");
                        final int core = in.nextInt();

                        System.out.print("Threads of processor: ");
                        final int threads = in.nextInt();

                        shop.addComputer(brand, ram, rom, hz, size, panel, clockSpeed, core, threads);
                        break;
                    }
                    case 2: {
                        System.out.println("Choose the brand of the computer to be deleted: ");
                        System.out.println("Brand: 1. Acer, 2. Asus, 3. Lenovo, 4. Gigabyte");
                        System.out.print("Please choose: ");
                        int choose = in.nextInt();
                        String brand = null;
                        if (choose == 1) {
                            brand = Brand.Acer.toString();
                        } else if (choose == 2) {
                            brand = Brand.Asus.toString();
                        } else if (choose == 3) {
                            brand = Brand.Lenovo.toString();
                        } else if (choose == 4) {
                            brand = Brand.Gigabyte.toString();
                        }
                        shop.delComputer(brand);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the ram, hz, clock speed of the computer you are looking for: ");
                        final int ram = in.nextInt();
                        final int hz = in.nextInt();
                        final double clockSpeed = in.nextDouble();
                        System.out.println(shop.searchComputer(ram, hz, clockSpeed));
                        break;
                    }
                    default:
                        System.out.println("Invalid option. Please select a valid menu option.");
                        break;
                }
            } while (menu != 0);
        }
    }
}
