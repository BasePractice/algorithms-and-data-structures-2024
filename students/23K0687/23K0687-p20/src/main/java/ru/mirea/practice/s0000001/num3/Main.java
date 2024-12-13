package ru.mirea.practice.s0000001.num3;

public final class Main {

    public static class G<T extends Comparable<T>, V extends Animal, K> {
        T t;
        V v;
        K k;

        public G(T t, V v, K k) {
            this.t = t;
            this.v = v;
            this.k = k;
        }

        public T getT() {
            return t;
        }

        public V getV() {
            return v;
        }

        public K getK() {
            return k;
        }

        public void printClassNames() {
            System.out.println("Класс T: " + t.getClass().getName());
            System.out.println("Класс V: " + v.getClass().getName());
            System.out.println("Класс K: " + k.getClass().getName());
        }
    }

    static class Dog implements Animal {
        String name;

        Dog(String name) {
            this.name = name;
        }
    }

    private Main() {
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        G<String, Dog, Integer> obj = new G<>("Test", dog, 123);
        obj.printClassNames();
    }
}
