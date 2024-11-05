package ru.mirea.practice.s0000001.prog5;

public abstract class Main {
    public static void main(String[] args) {
        String[] phoneNumbers = {
            "+79175655655",  // Международный формат для России
            "+104289652211", // Международный формат для другой страны
            "89175655655"    // Российский формат
        };

        for (String phone : phoneNumbers) {
            try {
                TelephoneNumber pn = new TelephoneNumber(phone);
                System.out.println(pn);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
