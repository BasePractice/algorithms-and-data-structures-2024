package ru.mirea.practice.s23k0690;


public final class Task2 {

    private Task2() {}

    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("Сигарета");
        myList.add("Банан");
        myList.add("Камень");
        MyListIterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
