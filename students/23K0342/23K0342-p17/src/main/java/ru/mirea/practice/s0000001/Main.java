package ru.mirea.practice.s0000001;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        List list = new List();

        list.insertSorted("яблоко");
        list.insertSorted("банан");
        list.insertSorted("вишня");
        list.insertSorted("груша");
        list.insertSorted("абрикос");

        System.out.println("Отсортированный список строк:");
        list.printList();

        list.clear();
    }
}
