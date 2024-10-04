package ru.mirea.practice.s23k0089.task11;

public abstract class Main {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(451, Unit.FAHRENHEIT);
        Temperature temp2 = new Temperature(5, Unit.CELSIUS);
        Temperature temp3 = new Temperature(273, Unit.KELVIN);
        System.out.printf("temp1: %s\ntemp2: %s\ntemp3: %s\n", temp1, temp2, temp3);

        temp1.convert(Unit.CELSIUS);
        temp2.convert(Unit.KELVIN);
        temp3.convert(Unit.FAHRENHEIT);
        System.out.printf("temp1: %s\ntemp2: %s\ntemp3: %s\n", temp1, temp2, temp3);
    }
}