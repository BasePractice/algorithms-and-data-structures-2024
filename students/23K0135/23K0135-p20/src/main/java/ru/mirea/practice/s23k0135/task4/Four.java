package ru.mirea.practice.s23k0135.task4;

public final class Four {

    private Four() {

    }

    public static void main(String[] args) {
        MinMax<Integer> minMaxInt = new MinMax<>();
        Integer[] intArray = {9, 6, 4, 3, 8, 16};
        System.out.println("Min: " + minMaxInt.findMin(intArray));
        System.out.println("Max: " + minMaxInt.findMax(intArray));

        MinMax<String> minMaxString = new MinMax<>();
        String[] strArray = {"cherry", "pomegranate",  "cucumber", "strawberry"};
        System.out.println("Min: " + minMaxString.findMin(strArray));
        System.out.println("Max: " + minMaxString.findMax(strArray));

        System.out.println("Сумма 1 и 16: " + Calc.sum(1, 16));
        System.out.println("Сумма 6.7 и 2.9: " + Calc.sum(6.7, 2.9));
        System.out.println("Умножение 2 и 3: " + Calc.multiply(2, 3));
        System.out.println("Умножение 6.7 и 2.9: " + Calc.multiply(6.7, 2.9));
        System.out.println("Деление 2 и 3: " + Calc.divide(2, 3));
        System.out.println("Деление 6.7 и 2.9: " + Calc.divide(6.7, 2.9));
        System.out.println("Вычитание 2 и 3: " + Calc.subtraction(2, 3));
        System.out.println("Вычитание 6.7 и 2.9: " + Calc.subtraction(6.7, 2.9));
    }

}
