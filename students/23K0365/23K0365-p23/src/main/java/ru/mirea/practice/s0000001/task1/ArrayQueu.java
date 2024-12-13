package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;
// Инвариант:
//Индекс начала очереди всегда меньше или равен
//индексу конца очереди, при этом оба индекса находятся в
//пределах допустимого диапазона массива (от 0 до [макс. значения - 1] ).
//Разница между индексом конца и индексом начала, взятая по модулю
//размера массива, равна текущему количеству элементов в очереди

//Предусловие:
//Очередь не должна быть полной - должно быть достаточно места для добавления нового элемента.
//Очередь не должна быть пустой - должен существовать хотя бы один элемент для удаления и
//чтобы вернуть его.

//Постусловие:
//После добавления элемента, новый элемент находится в конце очереди, количество элементов в
//очереди увеличилось на один, и очередь остается в корректном состоянии.

//После удаления элемента, первый элемент удален, количество элементов
//в очереди уменьшилось на один, и очередь остается в корректном
//состоянии, а функция возвращает удаленный элемент.

//Функция возвращает первый элемент очереди, не изменяя
//состояние очереди (количество элементов и их порядок). Очередь
//остается в корректном состоянии.
public class ArrayQueu {
    private Object[] consists;
    private int head;
    private int tail;
    private int size;
    private final int leng;

    public ArrayQueu(int one) {
        this.leng = one;
        consists = new Object[leng];
        head = 0;
        tail = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == leng;
    }

    public int size() {
        return size;
    }

    public void clear() {
        Arrays.fill(consists, null);
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(Object one) {
        if (isFull()) {
            System.out.println("FULL");
            return;
        }
        consists[tail] = one;
        tail = (tail + 1) % consists.length;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            return null;
        }
        return consists[head];
    }

    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object temp = consists[head];
        head = (head + 1) % consists.length;
        size--;
        return temp;
    }

    public static void main(String[] args) {
        ArrayQueu tester = new ArrayQueu(6);
        tester.enqueue(12);
        tester.enqueue("1");
        tester.enqueue(true);
        System.out.println(tester.isEmpty());
        System.out.println(tester.element());
        System.out.println(tester.dequeue());
        System.out.println(tester.dequeue());
        System.out.println(tester.dequeue());
        tester.clear();
        System.out.println(tester.element());

    }
}
