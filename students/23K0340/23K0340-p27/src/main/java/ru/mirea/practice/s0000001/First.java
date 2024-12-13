package ru.mirea.practice.s0000001;

import java.util.LinkedList;
import java.util.Scanner;

public abstract class First {
    public static class Elem {
        private String value;
        private String key;

        public Elem(String value, String key) {
            this.key = key;
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public void delete() {
            this.value = null;
            this.key = null;
        }
    }

    public static class Hashtab {
        private LinkedList<Elem>[] tab;
        private int size;

        public void hashtabInit(int size) {
            this.size = size;
            this.tab = new LinkedList[size];
            for (int i = 0;i < size;i++) {
                tab[i] = new LinkedList<>();
            }
        }

        public int hashtabHash(String value) {
            return Math.abs(value.hashCode() % size);
        }

        public void hashtabAdd(String value, String key) {
            int i = hashtabHash(key);
            for (Elem e : tab[i]) {
                if (e.key.equals(key)) {
                    e.setValue(value);
                    return;
                }
            }
            tab[i].add(new Elem(value, key));
        }

        public String hashtabLookup(String key) {
            int i = hashtabHash(key);
            for (Elem e : tab[i]) {
                if (e.key.equals(key)) {
                    return e.getValue();
                }
            }
            System.out.println("No such key");
            return "";
        }

        public void hashtabDelete(String key) {
            int i = hashtabHash(key);
            for (Elem e : tab[i]) {
                if (e.key.equals(key)) {
                    e.delete();
                }
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Hashtab hs = new Hashtab();
            hs.hashtabInit(10);
            for (int i = 0;i < 10;i++) {
                hs.hashtabAdd(sc.nextLine(), sc.nextLine());
            }
            System.out.println(hs.hashtabLookup("f"));
            hs.hashtabDelete("f");
            System.out.println(hs.hashtabLookup("f"));
        }
    }
}
