package ru.mirea.practice.s23l0908.task123;

public class Main<T extends String, V extends Animal, K extends Number> {
    private final T type;
    private final V value;
    private final K key;

    public Main(T type, V value, K key) {
        this.type = type;
        this.value = value;
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "task_1{"
            + "type="
            + type
            + ", value="
            + value
            + ", key="
            + key
            +
            '}';
    }

    public static void main(String[] args) {
        Main<String,Animal,Integer> task = new Main<>("Cat",new Cat(),15);
        System.out.println(task);
    }
}
