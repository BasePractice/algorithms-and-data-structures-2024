package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class DateComparisonApp {
    private DateComparisonApp() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            MyDateComparison dateComparison = new MyDateComparison();

            System.out.println("Введите дату в формате dd-MM-yyyy HH:mm:ss: ");
            String userInput = scanner.nextLine();

            dateComparison.setUserDate(userInput);
            dateComparison.compareDates();
        }
    }
}
