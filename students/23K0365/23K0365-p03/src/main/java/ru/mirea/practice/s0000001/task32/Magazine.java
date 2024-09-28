package ru.mirea.practice.s0000001.task32;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Magazine {
    private int amoutMilk = 12;
    private int amountFanta = 12;
    private int amountEggs = 12;
    private double milkPrice;
    private double eggsPrice;
    private double fantePrice;

    public Magazine(double milkPrice, double eggsPrice, double fantePrice) {
        this.milkPrice = milkPrice;
        this.eggsPrice = eggsPrice;
        this.fantePrice = fantePrice;
    }

    public int getAmoutMilk() {
        return amoutMilk;
    }

    public int getAmountFanta() {
        return amountFanta;
    }

    public int getAmountEggs() {
        return amountEggs;
    }

    public double getMilkPrice() {
        return milkPrice;
    }

    public double getEggsPrice() {
        return eggsPrice;
    }

    public double getFantePrice() {
        return fantePrice;
    }

    public double addToU(Magazine arr) {
        try (Scanner sc = new Scanner(System.in)) {
            double price = .0;
            System.out.println("Next step:\n1.Add eggs\t2.Add Fanta\t3.Add Milk\t0.Exit");
            int choose = sc.nextInt();
            while (choose != 0) {
                switch (choose) {
                    case 1:
                        price += getEggsPrice();
                        System.out.println("Eggs added!");
                        break;
                    case 2:
                        price += getFantePrice();
                        System.out.println("Fanta added!");
                        break;
                    case 3:
                        price += getMilkPrice();
                        System.out.println("Milk added!");
                        break;
                    default:
                        System.out.println("Wrong enter. Try again.");
                        break;
                }
                System.out.println("Next step:\n1.Add eggs\t2.Add Fanta\t3.Add Milk\t0.Exit");
                choose = sc.nextInt();
            }
            return price;
        }
    }

    public void convertCurrency(double price) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose currency:\n1.USD(default)\t2.EURO\t3.YUAN");
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    NumberFormat format1 = NumberFormat.getCurrencyInstance(Locale.US);
                    System.out.println("\nU need to pay "
                            + format1.format((float)(price / 99.9)));
                    break;
                case 2:
                    NumberFormat format2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    System.out.println("\nU need to pay "
                            + format2.format((float)(price / 97.8)));
                    break;
                case 3:
                    NumberFormat format3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                    System.out.println("\nU need to pay "
                            + format3.format((float)(price / 12.4)));
                    break;
                default:
                    System.out.println("!TRY AGAIN!");
                    break;
            }
        }
    }
}