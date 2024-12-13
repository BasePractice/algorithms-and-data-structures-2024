package ru.mirea.practice.s23k0145.lab2;

public final class TestMyList {
    private TestMyList() {

    }

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.append("Элемент 1");
        myList.append("Элемент 2");
        myList.append("Элемент 3");

        System.out.println("Содержимое списка:");
        for (String item : myList) {
            System.out.println(item);
        }
    }
}
