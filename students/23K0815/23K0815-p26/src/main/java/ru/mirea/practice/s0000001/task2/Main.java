package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyArrayList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("!");

        MyIterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}