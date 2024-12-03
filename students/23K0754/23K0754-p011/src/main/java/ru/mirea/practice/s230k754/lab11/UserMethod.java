package ru.mirea.practice.s230k754.lab11;

import java.util.Calendar;
import java.util.Scanner;

//<Год><Месяц><Число>
//<Часы1><минуты>

public class UserMethod {
    private Calendar date;

    public UserMethod() {
        try (Scanner scanner = new Scanner(System.in)) {
            this.date = Calendar.getInstance();
            System.out.println("Введите год");
            this.date.set(Calendar.YEAR, scanner.nextInt());
            System.out.println("Введите месяц");
            this.date.set(Calendar.MONTH, getMont(scanner.nextInt()));
            System.out.println("Введите день");
            this.date.set(Calendar.DAY_OF_MONTH, scanner.nextInt());
            System.out.println("Введите час");
            this.date.set(Calendar.HOUR, scanner.nextInt());
            System.out.println("Введите минуту");
            this.date.set(Calendar.MINUTE, scanner.nextInt());
        }
    }



    private int getMont(int numMonth) {
        int mn = -1;
        switch (numMonth) {
            case 1:
                mn = Calendar.JANUARY;
                break;
            case 2:
                mn = Calendar.FEBRUARY;
                break;
            case 3:
                mn = Calendar.MARCH;
                break;
            case 4:
                mn = Calendar.APRIL;
                break;
            case 5:
                mn = Calendar.MAY;
                break;
            case 6:
                mn = Calendar.JUNE;
                break;
            case 7:
                mn = Calendar.JULY;
                break;
            case 8:
                mn = Calendar.AUGUST;
                break;
            case 9:
                mn = Calendar.SEPTEMBER;
                break;
            case 10:
                mn = Calendar.OCTOBER;
                break;
            case 11:
                mn = Calendar.NOVEMBER;
                break;
            case 12:
                mn = Calendar.DECEMBER;
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
        return mn;
    }

    public Calendar getDate() {
        return date;
    }
}
