package ru.mirea.practice.s23k0120.task1to3;

import java.io.Serializable;

public class GenericsTest<T extends Comparable<? super T>, V extends Animal & Serializable, K> {
    T object1;
    V object2;
    K object3;

    public GenericsTest(T object1, V object2, K object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public T getObject1() {
        return object1;
    }

    public V getObject2() {
        return object2;
    }

    public K getObject3() {
        return object3;
    }

    public void getVars() {
        System.out.printf("T: %s\nV: %s\nK: %s", object1.getClass(), object2.getClass(), object3.getClass());
    }
}
