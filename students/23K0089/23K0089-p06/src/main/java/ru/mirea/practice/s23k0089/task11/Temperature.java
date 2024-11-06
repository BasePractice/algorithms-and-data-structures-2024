package ru.mirea.practice.s23k0089.task11;

public class Temperature implements Convertible {
    private Unit unit;
    private double value;

    public Temperature(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static double convertRaw(double value, Unit unitFrom, Unit unitTo) {
        double returnValue = value;
        switch (unitFrom) {
            case CELSIUS:
                switch (unitTo) {
                    case KELVIN:
                        returnValue = value + 273;
                        break;
                    case FAHRENHEIT:
                        returnValue = value * 9 / 5 + 32;
                        break;
                    default:
                        break;
                }
                break;
            case FAHRENHEIT:
                switch (unitTo) {
                    case KELVIN:
                        returnValue = (value - 32) * 5 / 9 + 273;
                        break;
                    case CELSIUS:
                        returnValue = (value - 32) * 5 / 9;
                        break;
                    default:
                        break;
                }
                break;
            case KELVIN:
                switch (unitTo) {
                    case FAHRENHEIT:
                        returnValue = (value - 273) * 9 / 5 + 32;
                        break;
                    case CELSIUS:
                        returnValue = value - 273;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return returnValue;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void convert(Unit unitTo) {
        this.value = convertRaw(this.value, this.unit, unitTo);
        this.unit = unitTo;
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", this.value, this.unit);
    }
}
