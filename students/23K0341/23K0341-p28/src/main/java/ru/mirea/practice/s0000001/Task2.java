package ru.mirea.practice.s0000001;

import java.util.Arrays;

/**
 * Создайте класс Map< String, String > и добавьте десять записей,
 * которые представляют пары (фамилия, имя). Проверьте, сколько
 * людей имеют одинаковое имя или фамилию. Требования к программе:
 * <br>
 * a) Программа не должна отображать текст на экране.
 * <br>
 * b) Программа не должна считывать значения с клавиатуры
 * <br>
 * c) Метод createMap () должен создать и вернуть HashMap, который
 * имеет элементы (String, String) и содержит 10 записей,
 * представляющих пары (фамилия, имя).
 * <br>
 * d) Метод getSameFirstNameCount () должен возвращать количество
 * людей с одинаковыми именами.
 * <br>
 * e) Метод getSameLastNameCount () должен возвращать количество
 * людей с одинаковой фамилией
 */

public abstract class Task2 {
    public static void main(String[] args) {
        Map map = new Map();

        System.out.println(map);
        System.out.println(map.getSameFirstNameCount());
        System.out.println(map.getSameLastNameCount());
    }


    static class Map {
        private final Pair<String>[] pairs;

        Map() {
            pairs = new Pair[10];

            pairs[0] = new Pair<>("Toster", "Tester");
            pairs[1] = new Pair<>("Testo", "Toaster");
            pairs[2] = new Pair<>("Test", "Test");
            pairs[3] = new Pair<>("Ivanov", "Example");
            pairs[4] = new Pair<>("Example", "Ivan");
            pairs[5] = new Pair<>("Petrov", "Gleb");
            pairs[6] = new Pair<>("Surname", "Petya");
            pairs[7] = new Pair<>("Petro", "Gleb");
            pairs[8] = new Pair<>("Ivanov", "Petya");
            pairs[9] = new Pair<>("Petrov", "Ivan");
        }

        int getSameFirstNameCount() {
            return countSame().s;
        }

        int getSameLastNameCount() {
            return countSame().f;
        }

        private Pair<Integer> countSame() {
            Pair<Integer> res = new Pair<>(0, 0);

            for (int i = 0; i < pairs.length - 1; i++) {
                for (int j = i + 1; j < pairs.length; j++) {
                    res = res.add(pairs[i].compare(pairs[j]));
                }
            }

            res.f *= 2;
            res.s *= 2;

            return res;
        }

        @Override
        public String toString() {
            return Arrays.toString(pairs);
        }
    }

    static class Pair<T> {
        T f;
        T s;

        Pair(T firstEl, T secondEl) {
            f = firstEl;
            s = secondEl;
        }

        Pair<Integer> compare(Pair<T> o) {
            Pair<Integer> res = new Pair<>(0, 0);

            if (f.equals(o.f)) {
                res.f = 1;
            }
            if (s.equals(o.s)) {
                res.s = 1;
            }

            return res;
        }

        Pair<Integer> add(Pair<Integer> o) {
            if (f instanceof Integer) {
                return new Pair<>((Integer) f + o.f, (Integer) s + o.s);
            }
            throw new IllegalArgumentException("Arguments type is not supported.");
        }

        @Override
        public String toString() {
            return "(" + f + ", " + s + ")";
        }
    }
}
