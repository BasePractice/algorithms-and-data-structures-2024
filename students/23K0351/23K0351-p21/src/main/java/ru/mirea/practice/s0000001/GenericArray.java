package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.List;

public class GenericArray<T> {
    private List<T> elements;

    public GenericArray() {
        elements = new ArrayList<>();
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public List<T> getElements() {
        return elements;
    }

    public static void main(String[] args) {
        GenericArray<Integer> intArray = new GenericArray<>();
        intArray.addElement(1);
        intArray.addElement(2);
        intArray.addElement(3);

        GenericArray<String> stringArray = new GenericArray<>();
        stringArray.addElement("Hello");
        stringArray.addElement("World");

        System.out.println("Integer Array: " + intArray.getElements());
        System.out.println("String Array: " + stringArray.getElements());
    }
}
