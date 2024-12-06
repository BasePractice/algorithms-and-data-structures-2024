package ru.mirea.practice.s23l0908.task2;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CustomListIterator<T> implements Iterator<T> {
    private final List<T> list; // Список, который будет итерироваться
    private int currentIndex = 0; // Текущий индекс

    // Конструктор принимает список
    public CustomListIterator(List<T> list) {
        this.list = list;
    }

    // Проверяет, есть ли следующий элемент
    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    // Возвращает следующий элемент
    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Больше нет элементов в списке.");
        }
        return list.get(currentIndex++);
    }

    // Удаляет текущий элемент (опционально)
    @Override
    public void remove() {
        if (currentIndex <= 0) {
            throw new IllegalStateException("Удаление элемента возможно только после вызова next().");
        }
        list.remove(--currentIndex);
    }

    // Тестирование пользовательского итератора
    public static void main(String[] args) {
        // Пример списка
        List<String> myList = new ArrayList<>(List.of("Element1", "Element2", "Element3", "Element4"));

        // Создаем пользовательский итератор
        CustomListIterator<String> customIterator = new CustomListIterator<>(myList);

        // Используем итератор для прохода по элементам списка
        System.out.println("Элементы списка:");
        while (customIterator.hasNext()) {
            System.out.println(customIterator.next());
        }

        // Тест удаления элемента
        customIterator = new CustomListIterator<>(myList);
        if (customIterator.hasNext()) {
            customIterator.next();
            customIterator.remove(); // Удаляем первый элемент
        }
        System.out.println("Список после удаления первого элемента:");
        for (String item : myList) {
            System.out.println(item);
        }
    }
}
