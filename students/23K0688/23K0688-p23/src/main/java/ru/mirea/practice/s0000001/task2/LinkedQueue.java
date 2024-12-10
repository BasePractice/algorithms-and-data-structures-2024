package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedQueue<T> implements Queue<T> {
    private List<T> list = new ArrayList<>(); // Using ArrayList instead of LinkedList

    @Override
    public void setArr(T[] arr) {
        list.clear(); // Clear the list before adding elements
        Collections.addAll(list, arr); // Add all elements from the array
    }

    @Override
    public void enqueue(T t) {
        list.add(t); // Add element to the end of the list
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty"); // Handle empty queue case
        }
        T t = list.get(0); // Get the first element
        list.remove(0); // Remove the first element
        return t; // Return the dequeued element
    }

    @Override
    public void print() {
        System.out.println("Start");
        for (T t : list) {
            System.out.println(t); // Print each element
        }
        System.out.println("End");
    }

    @Override
    public T getElement() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty"); // Handle empty queue case
        }
        return list.get(0); // Return the first element without removing it
    }

    @Override
    public void clear() {
        list.clear(); // Clear the list
    }

    @Override
    public int getSize() {
        return list.size(); // Return the size of the list
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty(); // Check if the list is empty
    }
}
