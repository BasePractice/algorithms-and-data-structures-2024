package ru.mirea.practice.s0000001.tasksfrom1to3;

public class Contentt {
    String key;
    Object val;

    public Contentt(String key, Object val) {
        this.key = key;
        this.val = val;
    }

    @Override
    public String toString() {
        return "key = " + key + "; value - " + val;
    }

}
