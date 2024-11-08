package ru.mirea.practice.s23k0350;

abstract class OnlinePurchase {
    public static void main(String[] args) {
        String fullName = "Иван Иванович Иванов";
        String inn = "1234567890";
        try {
            Client client = new Client(fullName, inn);
            System.out.println("Заказ оформлен успешно. " + client);
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
    }
}