package ru.mirea.practice.s23l0908.task1;

public final class Arrayqueuemodule {
    private static final int MINIMAL_CAPACITY = 16;
    private static Object[] array;
    private static int capacity;
    private static int size;
    private static int head;
    private static int tail;

    private Arrayqueuemodule() {
    }

    static {
        size = 0;
        head = 0;
        tail = 0;
        capacity = MINIMAL_CAPACITY;
        array = new Object[MINIMAL_CAPACITY];
    }

    private static void resize(int newCapacity) {
        Object[] oldqueue = array;
        array = new Object[newCapacity];
        capacity = newCapacity;
        if (size > 0) {
            if (head >= tail) {
                System.arraycopy(oldqueue, head, array, 0, size - tail);
                System.arraycopy(oldqueue, 0, array, size - tail, tail);
            } else {
                System.arraycopy(oldqueue, head, array, 0, size);
            }
        }
        head = 0;
        tail = size;
    }

    public static void enqueue(Object elem) {
        if (size == capacity) {
            resize(capacity * 2);
        }
        array[tail] = elem;
        tail = (tail + 1) % capacity;
        size++;
    }

    @SuppressWarnings("unused")
    public static void push(Object elem) {
        if (size == capacity) {
            resize(capacity * 2);
        }
        head--;
        if (head < 0) {
            head = capacity - 1;
        }
        array[head] = elem;
        size++;
    }

    public static Object element() {
        assert size > 0;
        return array[head];
    }

    @SuppressWarnings("unused")
    public static Object peek() {
        assert size > 0;
        return array[tail == 0 ? capacity - 1 : tail - 1];
    }

    public static Object dequeue() {
        assert size > 0;
        Object r = element();
        head = (head + 1) % capacity;
        size--;
        return r;
    }

    public static int size() {
        return size;
    }

    @SuppressWarnings("unused")
    public static boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unused")
    public static void clear() {
        size = 0;
        head = 0;
        tail = 0;
    }

    public static void display() {
        for (int i = 0; i < size(); i++) {
            System.out.print(array[(head + i) % capacity] + " ");
        }
    }

    public static void main(String[] args) {
        // Không tạo đối tượng nữa, gọi thẳng phương thức static.
        Arrayqueuemodule.enqueue(1);
        Arrayqueuemodule.enqueue(2);
        Arrayqueuemodule.enqueue(3);
        System.out.print("Queue: ");
        Arrayqueuemodule.display();

        Arrayqueuemodule.dequeue(); // dequeue trả về giá trị, có thể in ra nếu cần
        System.out.print("\nQueue: ");
        Arrayqueuemodule.display();
    }

}
