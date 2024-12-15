package ru.mirea.practice.s0000001.tasksfrom1to3;

import java.util.PriorityQueue;

public abstract class TaskFour { //не совсем понятно задание
    public static void main(String[] args) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int i = 1; i < 11; i++) {
            pQ.add(i);
        }
        while (!pQ.isEmpty()) {
            System.out.println(pQ.poll());
        }
    }
}
