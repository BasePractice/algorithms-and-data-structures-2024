package ru.mirea.practice.s23k0116.format;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {

        Locale russianLocale = new Locale("ru", "RU");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1) Рубли\n2) Доллары\n3) Евро");
            System.out.println("Выберите текущую валюту");
            int curVal = sc.nextInt();
            System.out.println("Введите количество");
            float value = sc.nextFloat();
            Convertor bank = new Convertor(curVal, value);
            float[] res = bank.result();
            System.out.println("В рублях: " + NumberFormat.getCurrencyInstance(russianLocale).format(res[0]));
            System.out.println("В долларах: " + NumberFormat.getCurrencyInstance(Locale.US).format(res[1]));
            System.out.printf("В евро: " + NumberFormat.getCurrencyInstance(Locale.GERMANY).format(res[2]));
        }
    }
}
