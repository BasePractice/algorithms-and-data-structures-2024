package mirea.lab11;

/* Приложение, сравнивающее текущую дату и дату, введенную
пользователем c текущим системным временем */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public abstract class Prac11p2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
            System.out.print("\nВведите дату(dd.mm.yyyy): ");
            String inp = sc.nextLine();
            Calendar user = Calendar.getInstance();
            if (inp.length() == 10) {
                user.set(Calendar.DAY_OF_MONTH, Integer.parseInt(inp.substring(0, 2)));
                user.set(Calendar.MONTH, Integer.parseInt(inp.substring(3, 5)) - 1);
                user.set(Calendar.YEAR, Integer.parseInt(inp.substring(6)));
                Calendar now = Calendar.getInstance();
                long u = user.getTimeInMillis();
                long n = now.getTimeInMillis();
                System.out.println("Разница между " + f.format(user.getTime()) + " и " + f.format(now.getTime())
                        + " составляет " + (int) ((double) Math.abs(u - n) / 1000 / 60 / 60 / 24) + " дня.");
            } else {
                System.out.println("Неверный ввод даты");
                System.exit(0);
            }

        }
    }
}
