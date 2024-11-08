package ru.mirea.practice.s0000001.prog5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public abstract class Main {

    public static void main(String[] args) {
        // Создаем список с 10000 элементов
        int size = 10000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        // Заполняем списки случайными числами
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt());
            linkedList.add(random.nextInt());
        }

        // Измеряем время выполнения операций

        // Вставка в начало списка
        long startTime = System.nanoTime();
        arrayList.add(0, 1);
        long endTime = System.nanoTime();
        System.out.println("ArrayList вставка в начало: " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        linkedList.add(0, 1);
        endTime = System.nanoTime();
        System.out.println("LinkedList вставка в начало: " + (endTime - startTime) + " наносекунд");

        // Удаление из начала списка
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        System.out.println("ArrayList удаление из начала: " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        linkedList.remove(0);
        endTime = System.nanoTime();
        System.out.println("LinkedList удаление из начала: " + (endTime - startTime) + " наносекунд");

        // Добавление в конец списка
        startTime = System.nanoTime();
        arrayList.add(1);
        endTime = System.nanoTime();
        System.out.println("ArrayList добавление в конец: " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        linkedList.add(1);
        endTime = System.nanoTime();
        System.out.println("LinkedList добавление в конец: " + (endTime - startTime) + " наносекунд");

        // Поиск элемента по образцу
        int target = random.nextInt(size);
        startTime = System.nanoTime();
        arrayList.contains(target);
        endTime = System.nanoTime();
        System.out.println("ArrayList поиск по образцу: " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        linkedList.contains(target);
        endTime = System.nanoTime();
        System.out.println("LinkedList поиск по образцу: " + (endTime - startTime) + " наносекунд");
    }
}
