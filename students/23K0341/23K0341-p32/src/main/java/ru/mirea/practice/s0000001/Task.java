package ru.mirea.practice.s0000001;

import java.util.Arrays;

/**
 * Задание 1 Реализовать алгоритма генерации перестановок
 * Джонсона-Троттера:<br>
 * Описание алгоритма<br>
 *  На русском яз. + псевдокод:
 * <a href="https://books.google.ru/books?id=HIaf7DSPtl0C&pg=PA228&lpg=PA228&dq=алгоритм+джонсона+троттера&source=bl&ots=YOhS_RzlkF&sig=754ZHiufVsdeiLr8fxQpuSsHjaU&hl=ru&sa=X&sqi=2&ved=0ahUKEwjxo83l5ffTAhVsJ5oKHTasBSYQ6AEINDAC#v=onepage&q=алгоритм%20джонсона%20троттера&f=false">...</a><br>
 *  На англ.яз с картинками- понятно:
 * <a href="https://mathlesstraveled.com/2013/01/03/the-steinhaus-johnson-trotter-algorithm/">...</a><br>
 * Учебное пособие можно взять здесь
 * <a href="http://fit.nsu.ru/data_/courses/niu/daio_komb_alg_uchpos.pdf">...</a>
 */

public abstract class Task {
    static void cycle(int[] data, int moving) {
        for (int i = data.length - 1; i > (moving > 0 ? 0 : 1); i--) {
            System.out.println(Arrays.toString(data));
            int temp = data[i - 1];
            data[i - 1] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        int len = 4;
        int[] data = new int[len];

        for (int i = 0; i < len; i++) {
            data[i] = i + 1;
        }

        for (int i = 0; i < len; i++) {
            cycle(data, len - 1 - i);
        }
        System.out.println(Arrays.toString(data));
    }
}
