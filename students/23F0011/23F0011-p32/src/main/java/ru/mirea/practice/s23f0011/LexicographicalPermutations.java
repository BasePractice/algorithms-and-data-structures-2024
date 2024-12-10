package ru.mirea.practice.s23f0011;

public abstract class LexicographicalPermutations {

    // Метод для печати перестановки
    public static void printPermutation(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Метод для генерации следующей перестановки в лексикографическом порядке
    public static boolean nextPermutation(int[] arr) {
        int n = arr.length;

        // Шаг 1: Найти первый элемент, который нарушает порядок убывания
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Если такого элемента нет, то мы достигли последней перестановки
        if (i == -1) {
            return false;
        }

        // Шаг 2: Найти первый элемент, который больше найденного на предыдущем шаге
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Шаг 3: Поменять местами элементы i и j
        swap(arr, i, j);

        // Шаг 4: Перевернуть подмассив справа от позиции i
        reverse(arr, i + 1, n - 1);

        return true;
    }

    // Метод для обмена двух элементов массива
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Метод для переворота массива от индекса i до j
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
