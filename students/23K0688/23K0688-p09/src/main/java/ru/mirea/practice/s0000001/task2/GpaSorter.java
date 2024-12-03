package ru.mirea.practice.s0000001.task2;

public class GpaSorter {

    public void quick(Studentgpa[] sg, int on, int tw) {
        if (on < tw) {
            int i1 = sec(sg, on, tw);
            quick(sg, on, i1 - 1);
            quick(sg, i1 + 1, tw);
        }
    }

    private int sec(Studentgpa[] sg, int on, int tw) {
        int i = on - 1;
        for (int j = on; j < tw; j++) {
            if (sg[j].compareTo(sg[tw]) > 0) {
                i++;
                Studentgpa temp = sg[i];
                sg[i] = sg[j];
                sg[j] = temp;
            }
        }
        Studentgpa temp = sg[i + 1];
        sg[i + 1] = sg[tw];
        sg[tw] = temp;
        return i + 1;
    }
}
