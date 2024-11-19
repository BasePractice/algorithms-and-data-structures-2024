package ru.mirea.practice.s0000001;

public final class TestMinMax {
    private TestMinMax() {

    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 1, 8, 2};
        MinMax<Integer> minMaxInt = new MinMax<>(intArray);

        System.out.println("Минимальное значение: " + minMaxInt.findMin());
        System.out.println("Максимальное значение: " + minMaxInt.findMax());

        String[] stringArray = {"apple", "banana", "kiwi", "grape"};
        MinMax<String> minMaxString = new MinMax<>(stringArray);

        System.out.println("Минимальное значение: " + minMaxString.findMin());
        System.out.println("Максимальное значение: " + minMaxString.findMax());
    }
}
