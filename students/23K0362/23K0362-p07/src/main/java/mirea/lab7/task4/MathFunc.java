package mirea.lab9.task4;

import java.util.Objects;

public class MathFunc implements MathCalculable {
    @Override
    public double absComplex(String number) {
        if (Objects.equals(number, "")) {
            return 0;
        }
        Double intNumb = 0.0;
        Double complexNumb = 0.0;
        StringBuilder dopString = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '+' || number.charAt(i) == '-') {
                if (dopString.length() != 0) {
                    intNumb += Double.parseDouble(dopString.toString());
                    dopString = new StringBuilder();
                }
            } else if (number.charAt(i) != 'i') {
                dopString.append(number.charAt(i));
                if (i == number.length() - 1) {
                    intNumb += Double.parseDouble(dopString.toString());
                }
            } else {
                if (dopString.length() != 0) {
                    complexNumb += Double.parseDouble(dopString.toString());
                } else {
                    complexNumb = 1.0;
                }
                dopString = new StringBuilder();
            }
        }
        return Math.pow(intNumb * intNumb + complexNumb * complexNumb, 0.5);
    }

    @Override
    public double pow(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double circumference(double radius) {
        return 2 * PI * radius; // Используем константу PI из интерфейса
    }
}
