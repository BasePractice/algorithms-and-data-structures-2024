package mirea.lab21.p1;

/* 1 Написать метод для конвертации массива строк/чисел в список. */

import java.util.List;

public abstract class Prac21p1 {
    public static void main(String[] args) {
        ArrayConvert ar = new ArrayConvert();
        String[] s = {"abc", "def", "aaaaaa", "cbcbcb"};
        List list = ar.convert(s);
        System.out.println(list.toString());
    }
}
