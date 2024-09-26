package ru.mirea.practice.s23k0143;

public class Converter {
    private final String[] currencies;
    private final double[] rates;

    public Converter(String[] currencies, double[] rates) {
        this.currencies = currencies;
        this.rates = rates;
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        int fromIndex = -1;
        int toIndex = -1;

        for (int i = 0; i < currencies.length; i++) {
            if (currencies[i].equals(fromCurrency)) {
                fromIndex = i;
            }
            if (currencies[i].equals(toCurrency)) {
                toIndex = i;
            }
        }

        double baseSumCurrency = amount / rates[fromIndex];
        return baseSumCurrency * rates[toIndex];
    }

    public static void main(String[] args) {
        String[] currencies = {"USD", "EUR", "RUB"};
        double[] rates = {1.0, 0.90, 92.80};

        Converter converter = new Converter(currencies, rates);

        double sumToConvert = 80;
        String fromCurrency = "USD";
        String toCurrency = "EUR";

        double convertedSum = converter.convert(sumToConvert, fromCurrency, toCurrency);
        System.out.println(sumToConvert + " " + fromCurrency + " = " + convertedSum + " " + toCurrency);
    }
}
