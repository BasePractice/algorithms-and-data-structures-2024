package ru.mirea.practice.s0000002.pw4.task3;

public class List {
    private String name;
    private String disc;
    private int count;

    public List(String name, String disc, int count) {
        this.name = name;
        this.disc = disc;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}