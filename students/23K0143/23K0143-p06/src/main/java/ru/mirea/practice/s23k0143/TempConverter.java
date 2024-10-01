package ru.mirea.practice.s23k0143;

class TempConverter implements Convertable {
    @Override
    public void convert(double celsius) {
        double kelvin = celsius + 273.15;
        double farengeit = celsius * 9 / 5 + 32;

        System.out.println("Температура по Цельсию: " + celsius);
        System.out.println("Температура по Кельвину: " + kelvin);
        System.out.println("Температура по Фаренгейту: " + farengeit);
    }

    public static void main(String[] args) {
        TempConverter converter = new TempConverter();
        double celsiusTemp = 25;
        converter.convert(celsiusTemp);
    }
}
