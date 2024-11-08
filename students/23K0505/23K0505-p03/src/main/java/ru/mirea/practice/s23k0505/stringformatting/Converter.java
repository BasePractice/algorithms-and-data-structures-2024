package ru.mirea.practice.s23k0505.stringformatting;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;

public class Converter extends ArrayList<Currency> {

    public Currency getCurrency(String name) throws NoSuchObjectException {
        for (Currency currency : this) {
            if (currency.getName().equals(name)) {
                return currency;
            }
        }
        throw new NoSuchObjectException(String.format("No currency with name '%s' found", name));
    }

    public String convert(float valueFrom, String currencyFromName, String currencyToName) {
        Currency currencyFrom;
        Currency currencyTo;
        try {
            currencyFrom = getCurrency(currencyFromName);
            currencyTo = getCurrency(currencyToName);
        } catch (NoSuchObjectException e) {
            return e.toString();
        }
        return convert(valueFrom, currencyFrom, currencyTo);
    }

    public String convert(float valueFrom, Currency currencyFrom, Currency currencyTo) {
        float valueTo = valueFrom * currencyFrom.getValue() / currencyTo.getValue();
        return String.format("%s = %s", Currency.getValueFormatted(valueFrom, currencyFrom.getLocale()),
                Currency.getValueFormatted(valueTo, currencyTo.getLocale()));
    }
}
