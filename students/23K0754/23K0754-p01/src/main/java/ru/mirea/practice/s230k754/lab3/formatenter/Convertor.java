package ru.mirea.practice.s230k754.lab3.formatenter;

import java.util.Objects;

public final class Convertor {
    private Convertor() {}

    public static int setPrise(int prise, String currency) {
        if (Objects.equals(currency, "RUB")) {
            return prise * 2;
        } else if (Objects.equals(currency, "USD")) {
            return prise * 5;
        }
        return prise;
    }
}
