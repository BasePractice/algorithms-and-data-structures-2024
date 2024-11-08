package ru.mirea.practice.s0000001.task1to3;

import java.io.Serializable;

public class GenericTVk<T extends Comparable, V extends Animal & Serializable, K> {
    private T fs;
    private V sc;
    private K th;

    public GenericTVk(T fs, V sc, K th) {
        this.fs = fs;
        this.sc = sc;
        this.th = th;
    }

    public T getFs() {
        return fs;
    }

    public void getNameClass() {
        System.out.println("T class is " + fs.getClass().getName());
        System.out.println("V class is " + sc.getClass().getName());
        System.out.println("K class is " + th.getClass().getName());
    }

    public void setFs(T fs) {
        this.fs = fs;
    }

    public V getSc() {
        return sc;
    }

    public void setSc(V sc) {
        this.sc = sc;
    }

    public K getTh() {
        return th;
    }

    public void setTh(K th) {
        this.th = th;
    }
}
