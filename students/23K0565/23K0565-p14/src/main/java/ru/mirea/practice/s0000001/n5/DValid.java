package ru.mirea.practice.s0000001.n5;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class DValid {

    private DValid() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите дату для проверки (формат dd/mm/yyyy):");
            String input = scanner.nextLine();

            String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|[2-9][0-9])\\d\\d)$";
            Pattern pattern = Pattern.compile(regex);

            boolean isValid = pattern.matcher(input).matches();

            if (isValid) {
                System.out.println("Дата соответствует формату");
            } else {
                System.out.println("Дата не соответствует формату");
            }
        }
    }
}
