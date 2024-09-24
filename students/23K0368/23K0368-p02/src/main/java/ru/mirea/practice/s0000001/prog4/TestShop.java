package ru.mirea.practice.s0000001.prog4;
import java.util.Arrays;
import java.util.Scanner;

public abstract class TestShop {

    public static Shop[] remove(String element, Shop[] shop) {
        Shop[] shop1 = new Shop[shop.length];
        for (int i = 0; i < shop.length; i++) {
            if (shop[i].getModel().equals(element)) {
                shop1[i] = shop[i];
            }
        }
        return shop1;
    }

    public static Shop[] adding(Shop element, Shop[] shop) {
        Shop[] shop1 = new Shop[shop.length + 1];
        for (int i = 0; i < shop.length; i++) {
            shop1[i] = shop[i];
        }
        shop1[shop.length - 1] = element;
        return shop1;
    }

    public static void seek(Shop[] shop, String model) {
        Shop[] shop2 = new Shop[shop.length];
        for (int i = 0; i < shop.length; i++) {
            if (shop[i].getModel().equals(model)) {
                shop2[i] = shop[i];
            }
        }
        System.out.println(Arrays.toString(shop2));
    }

    public static void main(String[] args) {
        Shop[] shop = new Shop[4];
        try (Scanner sc = new Scanner(System.in)) {
            String[] array = new String[3];

            for (int i = 0; i < shop.length; i++) {
                System.out.println("Введите название цену и модель");
                String cmt = sc.nextLine();
                array = cmt.split("\\s");
                String model = array[0];
                Integer price = Integer.parseInt(array[1]);
                String name = array[2];
                shop[i] = new Shop(model, price, name);
            }
//        shop[0] = new Shop("Apple", 130, "M1");
//        shop[1] = new Shop("AMD", 140, "M2");
//        shop[2] = new Shop("Intel", 150, "M3");
//        shop[3] = new Shop("BMW", 160, "M4");

            System.out.println("Введите что вы хотите сделать добавить удалить или найти компьютер?");

            int d = sc.nextInt();
            if (d == 1) {
                System.out.println("Введите название мадоли для удаления");
                String str = sc.next();
                shop = remove(str, shop);
            }
            if (d == 2) {
                System.out.println("Введите название мадоли для добавления");
                Shop shop1 = new Shop("1", 11, "1");
                shop = adding(shop1, shop);
            }
            if (d == 3) {
                System.out.println("Введите название модели для поиска");
                if (sc.hasNext()) {
                    String model = sc.next();
                    seek(shop, model);
                }
            }

        }
    }
}

