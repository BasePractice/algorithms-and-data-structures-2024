package ru.mirea.practice.s23k0140.task4;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        MinMax<Integer> minMaxInt = new MinMax<>();
        Integer[] intArray = {6, 4, 2, 7, 1};
        System.out.println("Min: " + minMaxInt.findMin(intArray));
        System.out.println("Max: " + minMaxInt.findMax(intArray));

        MinMax<String> minMaxString = new MinMax<>();
        String[] strArray = {"apple", "orange", "banana", "pear"};
        System.out.println("Min: " + minMaxString.findMin(strArray));
        System.out.println("Max: " + minMaxString.findMax(strArray));

        System.out.println("Сумма 3 и 4: " + Calculator.sum(3, 4));
        System.out.println("Сумма 2.7 и 5.3: " + Calculator.sum(2.7, 5.3));
        System.out.println("Умножение 2 и 3: " + Calculator.multiply(2, 3));
        System.out.println("Умножение 3.5 и 8.2: " + Calculator.multiply(3.5, 8.2));
        System.out.println("Деление 3 и 6: " + Calculator.divide(3, 6));
        System.out.println("Деление 5.8 и 3.5: " + Calculator.divide(5.8, 3.5));
        System.out.println("Вычитание 3 и 8: " + Calculator.subtraction(3, 8));
        System.out.println("Вычитание 1.8 и 5.3: " + Calculator.subtraction(1.8, 5.3));
    }

}