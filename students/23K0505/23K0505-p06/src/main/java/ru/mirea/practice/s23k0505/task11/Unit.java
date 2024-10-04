package ru.mirea.practice.s23k0505.task11;

public enum Unit {
    CELSIUS,
    FAHRENHEIT,
    KELVIN;

    @Override
    public String toString() {
        switch (this) {
            case KELVIN:
                return "Kelvin";
            case CELSIUS:
                return "degrees Celsius";
            case FAHRENHEIT:
                return "degrees Fahrenheit";
            default:
                return "null";
        }
    }
}
