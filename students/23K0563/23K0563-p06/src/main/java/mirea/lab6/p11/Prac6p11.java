package mirea.lab6.p11;

import java.util.Scanner;

public abstract class Prac6p11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите температуру в С: ");
            float temp = sc.nextFloat();
            System.out.println("Введите систему для перевода (1 для F,2 для K): ");
            int choise = sc.nextInt();
            Convertable con = new CtoFahrenheit(0);
            if (choise == 1) {
                con = new CtoFahrenheit(temp);
            } else if (choise == 2) {
                con = new CtoKelvin(temp);
            } else {
                System.out.println("Неверный выбор");
                System.exit(0);
            }
            System.out.println("Результат перевода: " + con.convert() + " " + con.sym());
        }
    }
}
