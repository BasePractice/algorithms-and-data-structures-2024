package ru.mirea.practice.s230k754.lab11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimerCode {
    private List arrayList;
    private List linkedList;
    private long startTime;

    public TimerCode() {
        this.arrayList = new ArrayList<>();
        this.linkedList = new LinkedList<>();
    }

    public void timerLinkedList() {
        startTime = System.currentTimeMillis();

        addElements(linkedList);
        insertElement(linkedList, 2);
        for (int i = 0; i < linkedList.toArray().length; i++) {
            linkedList.remove(i);
        }

        System.out.println("Время выполнения кода c linkedList: " + (long) (System.currentTimeMillis() - startTime) + " милисекунд");
    }

    public void timerArrayList() {
        startTime = System.currentTimeMillis();

        addElements(arrayList);
        insertElement(arrayList, 2);
        for (int i = 0; i < arrayList.toArray().length; i++) {
            arrayList.remove(i);
        }

        System.out.println("Время выполнения кода c arrayList: " + (long) (System.currentTimeMillis() - startTime) + " милисекунд");
    }

    private void addElements(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    private void insertElement(List<Integer> list, int index) {
        for (int i = 0; i < 10000; i++) {
            list.add(index, i);
        }
    }
}
