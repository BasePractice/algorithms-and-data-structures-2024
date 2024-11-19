package ru.mirea.practice.s23k1167.task1.task1.task2.task2;

import java.util.Comparator;

class HuffmanComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.freq - y.freq;
    }
}
