package ru.mirea.practice.s0000001;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
            System.out.println("Key: " + key);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getDetails(null); // Вызов метода с null для тестирования
    }
}