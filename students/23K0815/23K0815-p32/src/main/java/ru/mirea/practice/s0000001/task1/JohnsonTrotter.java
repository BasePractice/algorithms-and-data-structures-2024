package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;

public class JohnsonTrotter {
    private int[] permutation; // Текущая перестановка
    private int[] directions; // Направления элементов
    private int n; // Количество элементов

    public JohnsonTrotter(int n) {
        this.n = n;
        this.permutation = new int[n];
        this.directions = new int[n];
        for (int i = 0; i < n; i++) {
            permutation[i] = i + 1; // Заполнение перестановки числами от 1 до n
            directions[i] = -1; // Изначально все элементы направлены влево
        }
    }

    public void generatePermutations() {
        boolean morePermutations = true;

        while (morePermutations) {
            // Печать текущей перестановки
            System.out.println(Arrays.toString(permutation));

            // Найти наибольший элемент, который может двигаться
            int largestMobileIndex = -1;
            int largestMobileValue = -1;

            for (int i = 0; i < n; i++) {
                if (isMobile(i)) {
                    if (permutation[i] > largestMobileValue) {
                        largestMobileValue = permutation[i];
                        largestMobileIndex = i;
                    }
                }
            }

            // Если не осталось мобильных элементов, завершить
            if (largestMobileIndex == -1) {
                morePermutations = false;
            } else {
                // Перемещение наибольшего мобильного элемента
                move(largestMobileIndex);

                // Изменение направления перемещенного элемента
                int movedValue = permutation[largestMobileIndex];
                for (int i = 0; i < n; i++) {
                    if (permutation[i] > movedValue) {
                        directions[i] = -directions[i]; // Изменяем направление
                    }
                }
            }
        }
    }

    private boolean isMobile(int index) {
        int direction = directions[index];
        int newIndex = index + direction;

        // Проверка, находится ли новый индекс в пределах массива
        return newIndex >= 0 && newIndex < n && permutation[newIndex] < permutation[index];
    }

    private void move(int index) {
        int direction = directions[index];
        int newIndex = index + direction;

        // Меняем местами элементы
        int temp = permutation[index];
        permutation[index] = permutation[newIndex];
        permutation[newIndex] = temp;
    }

    public static void main(String[] args) {
        int n = 3; // Задайте количество элементов
        JohnsonTrotter jt = new JohnsonTrotter(n);
        jt.generatePermutations();
    }
}