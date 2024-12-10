package ru.mirea.practice.s23k0155.task1;


class IntArrayNode {
    private static final int arrayCapacity = 5;
    private int[] values;
    private int size;
    IntArrayNode next;

    public IntArrayNode() {
        this.values = new int[arrayCapacity];
        this.size = 0;
        this.next = null;
    }

    // Метод для добавления значения в массив узла с сохранением упорядоченности
    public void insert(int value) {
        if (size == arrayCapacity) {  // Если массив переполнен
            if (next == null) {
                next = new IntArrayNode();
            }
            next.insert(value);
            return;
        }

        // Найти позицию для вставки нового элемента
        int i;
        for (i = size - 1; i >= 0 && values[i] > value; i--) {
            values[i + 1] = values[i];
        }

        values[i + 1] = value;
        size++;
    }

    // Метод для вывода значений массива
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        if (next != null) {
            next.print();
        }
    }
}
