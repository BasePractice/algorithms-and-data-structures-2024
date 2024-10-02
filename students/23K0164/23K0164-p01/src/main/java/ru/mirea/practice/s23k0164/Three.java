package ru.mirea.practice.s23k0164;

public final class Three {

    private Three() {

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }

        double average = 0.0;
        average = (double) sum / arr.length;

        System.out.println("\nМассив: ");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println("\nСумма элементов: " + sum);
        System.out.printf("Среднее арифметическое: %.2f\n", average);
    }
}
