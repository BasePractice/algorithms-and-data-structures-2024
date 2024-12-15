package ru.mirea.practice.s23k0087.tasks2and3;

public abstract class Tester {
    public static void main(String[] args) {
        String[] arrayStr = {"Volkswagen", "Das", "Auto"};
        GenericArr<String> stringGenericArr = new GenericArr<>(arrayStr);
        System.out.println(stringGenericArr);

        Long[] arrayLong = {2031L, 911922L, 1234567890L};
        GenericArr<Long> longGenericArr = new GenericArr<>(arrayLong);
        System.out.println(longGenericArr);

        Double[] arrayDouble = {20.31, 0.19293912, 0.41413, 0.221};
        GenericArr<Double> doubleGenericArr = new GenericArr<>(arrayDouble);
        System.out.println(doubleGenericArr);
    }
}
