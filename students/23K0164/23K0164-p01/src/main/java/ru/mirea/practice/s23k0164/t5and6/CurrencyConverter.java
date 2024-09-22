package ru.mirea.practice.s23k0164.t5and6;

public class CurrencyConverter {
    public enum Currency {
        USD(91.27),
        EUR(100.74),
        GBP(119.17),
        JPY(0.65);


        private final double rate;

        Currency(double rate) {
            this.rate = rate;
        }

        public double getRate() {
            return rate;
        }
    }
    public double convert(double rubles, Currency currency) {
        return rubles / currency.getRate();
    }
}
