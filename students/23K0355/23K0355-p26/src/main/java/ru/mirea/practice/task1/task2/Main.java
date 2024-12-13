package ru.mirea.practice.task1.task2;

public abstract class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(5);

        myList.add("A", 0);
        myList.add("B", 1);
        myList.add("C", 2);
        myList.add("D", 3);
        myList.add("E", 4);

        java.util.Iterator<String> iterator = myList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

