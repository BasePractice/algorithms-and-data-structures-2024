package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class ThrowsDemoAdvance {
    public void getDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
            String key = null;
            boolean valid = false;

            while (!valid) {
                try {
                    System.out.print("Введите ключ: ");
                    key = scanner.nextLine();

                    if (key == null || key.trim().isEmpty()) {
                        throw new NullPointerException("Нужно ввести ключ");
                    }

                    valid = true;
                    System.out.println("Ключ: " + key);
                } catch (NullPointerException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                    System.out.println("Попробуйте снова.");
                }
            }
        }
    }


    public static void main(String[] args) {
        ThrowsDemoAdvance demo = new ThrowsDemoAdvance();
        demo.getDetails();
    }
}
