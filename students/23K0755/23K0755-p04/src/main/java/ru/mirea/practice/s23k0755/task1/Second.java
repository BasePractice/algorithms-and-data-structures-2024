package ru.mirea.practice.s23k0755.task1;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Second {

    public enum Clothes {
        JEANS("Jeans", 3000),
        SHIRT("Shirt", 4000),
        DRESS("Dress", 7000),
        HAT("Hat", 10000),
        NOTHING("Nothing", 0);

        String name;
        int price;

        Clothes(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int getPrice(int number) {
            switch (number) {
                case 1:
                    return Clothes.JEANS.price;

                case 2:
                    return Clothes.SHIRT.price;

                case 3:
                    return Clothes.DRESS.price;

                case 4:
                    return Clothes.HAT.price;

                case 5:
                    return Clothes.NOTHING.price;
                default:
                    break;
            }
            return 0;
        }

        public String getName(int number) {
            switch (number) {
                case 1:
                    return Clothes.JEANS.name;

                case 2:
                    return Clothes.SHIRT.name;

                case 3:
                    return Clothes.DRESS.name;

                case 4:
                    return Clothes.HAT.name;

                case 5:
                    return Clothes.NOTHING.name;
                default:
                    break;
            }
            return "None";
        }

        @Override
        public String toString() {
            return name + " - " + price + " руб";
        }
    }

    public enum Shoes {
        SNEAKERS("Sneakers", 15000),
        SLIPPERS("Slippers", 2000),
        MOCCASINS("Moccasins", 88000),
        BOOTS("Boots", 6700),
        NOTHING("Nothing", 0);

        String name;
        int price;

        Shoes(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int getPrice(int number) {
            switch (number) {
                case 1:
                    return Shoes.SNEAKERS.price;

                case 2:
                    return Shoes.SLIPPERS.price;

                case 3:
                    return Shoes.MOCCASINS.price;

                case 4:
                    return Shoes.BOOTS.price;

                case 5:
                    return Shoes.NOTHING.price;
                default:
                    break;
            }
            return 0;
        }

        public String getName(int number) {
            switch (number) {
                case 1:
                    return Shoes.SNEAKERS.name;

                case 2:
                    return Shoes.SLIPPERS.name;

                case 3:
                    return Shoes.MOCCASINS.name;

                case 4:
                    return Shoes.BOOTS.name;

                case 5:
                    return Shoes.NOTHING.name;
                default:
                    break;
            }
            return "None";
        }

        @Override
        public String toString() {
            return name + " - " + price + " руб";
        }
    }

    public enum SportsStore {
        BALL("Ball", 1500),
        SKI("Ski", 4000),
        SKATEBOARD("Skateboard", 2000),
        BIKE("Bike", 10000),
        NOTHING("Nothing", 0);

        String name;
        int price;

        SportsStore(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int getPrice(int number) {
            switch (number) {
                case 1:
                    return SportsStore.BALL.price;

                case 2:
                    return SportsStore.SKI.price;

                case 3:
                    return SportsStore.SKATEBOARD.price;

                case 4:
                    return SportsStore.BIKE.price;

                case 5:
                    return SportsStore.NOTHING.price;
                default:
                    break;
            }
            return 0;
        }

        public String getName(int number) {
            switch (number) {
                case 1:
                    return SportsStore.BALL.name;

                case 2:
                    return SportsStore.SKI.name;

                case 3:
                    return SportsStore.SKATEBOARD.name;

                case 4:
                    return SportsStore.BIKE.name;

                case 5:
                    return SportsStore.NOTHING.name;
                default:
                    break;
            }
            return "None";
        }

        @Override
        public String toString() {
            return name + " - " + price + " руб";
        }
    }

    public enum Catalog {
        CLOTHES,
        SHOES,
        SPORTSSTORE,
        EXIT;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите логин: ");
            final String login = scanner.nextLine();
            System.out.print("Введите пароль: ");
            scanner.nextLine();
            System.out.println("Выбирите раздел магзина:");
            int i = 1;
            ArrayList<Integer> sum = new ArrayList<Integer>();
            ArrayList<String> basket = new ArrayList<>();
            int choice;
            boolean flag = true;
            while (flag) {
                i = 1;
                for (Catalog catalog : Catalog.values()) {
                    System.out.println(i + ") " + catalog.toString());
                    i++;
                }
                choice = scanner.nextInt();
                i = 1;
                switch (choice) {
                    case 1:
                        for (Clothes clothes : Clothes.values()) {
                            System.out.println(i + ") " + clothes.toString());
                            i++;
                        }
                        choice = scanner.nextInt();
                        Clothes clothes = Clothes.NOTHING;
                        sum.add(clothes.getPrice(choice));
                        basket.add(clothes.getName(choice));
                        break;
                    case 2:
                        for (Shoes shoes : Shoes.values()) {
                            System.out.println(i + ") " + shoes.toString());
                            i++;
                        }
                        choice = scanner.nextInt();
                        Shoes shoes = Shoes.NOTHING;
                        sum.add(shoes.getPrice(choice));
                        basket.add(shoes.getName(choice));
                        break;
                    case 3:
                        for (SportsStore sportsStore : SportsStore.values()) {
                            System.out.println(i + ")" + sportsStore.toString());
                            i++;
                        }
                        choice = scanner.nextInt();
                        SportsStore sportsStore = SportsStore.NOTHING;
                        sum.add(sportsStore.getPrice(choice));
                        basket.add(sportsStore.getName(choice));
                        break;

                    case 4:
                        flag = false;
                        break;
                    default:
                        break;
                }
            }
            flag = true;
            while (flag) {
                i = 1;
                System.out.println("Выберите товар, который хотите удлить:");
                for (String name : basket) {
                    System.out.println(i + " ) " + name);
                    i++;
                }
                System.out.println(i + ") Купить товары, находящиеся в корзине.");
                choice = scanner.nextInt();
                if (choice < i) {
                    basket.remove(choice - 1);
                } else {
                    flag = false;
                }
            }
            int itogSum = 0;
            for (int x : sum) {
                itogSum += x;
            }
            System.out.println("Сумма корзины пользователя " + login + " : " + itogSum);
            System.out.println(basket.toString());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}