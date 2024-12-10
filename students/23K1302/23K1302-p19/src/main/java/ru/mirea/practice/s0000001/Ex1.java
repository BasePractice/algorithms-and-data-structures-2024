package ru.mirea.practice.s0000001;

public final class Ex1 {

    private Ex1() {
        // NONE
    }

    public static void main(String[] args) {
        try {
            String inn = "12345967890";

            validateInn(inn);
            System.out.println("Заказ успешно оформлен!");
        } catch (InvalidInnException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void validateInn(String inn) throws InvalidInnException {
        if (inn.length() != 10) {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }
    }
}
