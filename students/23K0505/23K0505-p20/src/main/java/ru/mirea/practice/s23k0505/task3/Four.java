package ru.mirea.practice.s23k0505.task3;

public final class Four {

    private Four() {

    }

    public static void main(String[] args) {
        MinMax<Integer> minMaxInt = new MinMax<>();
        Integer[] intArray = {3, 5, 1, 8, 4};
        System.out.println("Min: " + minMaxInt.findMin(intArray));
        System.out.println("Max: " + minMaxInt.findMax(intArray));

        MinMax<String> minMaxString = new MinMax<>();
        String[] strArray = {"apple", "orange", "banana", "pear"};
        System.out.println("Min: " + minMaxString.findMin(strArray));
        System.out.println("Max: " + minMaxString.findMax(strArray));

        System.out.println("Сумма 5 и 10: " + Calculator.sum(5, 10));
        System.out.println("Сумма 5.5 и 3.2: " + Calculator.sum(5.5, 3.2));
        System.out.println("Умножение 5 и 10: " + Calculator.multiply(5, 10));
        System.out.println("Умножение 5.5 и 3.2: " + Calculator.multiply(5.5, 3.2));
        System.out.println("Деление 5 и 10: " + Calculator.divide(5, 10));
        System.out.println("Деление 5.5 и 3.2: " + Calculator.divide(5.5, 3.2));
        System.out.println("Вычитание 5 и 10: " + Calculator.subtraction(5, 10));
        System.out.println("Вычитание 5.5 и 3.2: " + Calculator.subtraction(5.5, 3.2));
    }

}
