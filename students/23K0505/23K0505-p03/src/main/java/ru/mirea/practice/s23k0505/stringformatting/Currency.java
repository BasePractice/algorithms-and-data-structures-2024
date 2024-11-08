package ru.mirea.practice.s23k0505.stringformatting;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency {
    public static Currency standart = new Currency("Ruble", new Locale("ru", "Ru"), 1);
    private final String name;
    private final Locale locale;
    private float value;

    public Currency(String name, Locale locale, float value) {
        this.name = name;
        this.locale = locale;
        this.value = value;
    }

    public static String getValueFormatted(float value, Locale locale) {
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(value);
    }

    public String getName() {
        return name;
    }

    public Locale getLocale() {
        return locale;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Currency{%s, %s = %s}", name,
                getValueFormatted(1, this.getLocale()),
                getValueFormatted(standart.getValue() / value, standart.getLocale()));
    }
}
