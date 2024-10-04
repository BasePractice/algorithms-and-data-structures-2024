package ru.mirea.practice.s23k0505.stringformatting;

import java.util.Locale;

public abstract class Tester {
    public static void main(String[] args) {
        Converter converter = new Converter();
        converter.add(new Currency("Ruble", new Locale("ru", "Ru"), 1));
        converter.add(new Currency("Dollar", Locale.US, 91.14f));
        converter.add(new Currency("Euro", Locale.FRANCE, 101.28f));
        converter.add(new Currency("Yuan", Locale.CHINA, 12.78f));

        System.out.println(converter.convert(1, "Dollar", "Ruble"));
        System.out.println(converter.convert(1, "Yuan", "Euro"));
        System.out.println(converter.convert(1, "Yuan", "Yen"));

    }
}