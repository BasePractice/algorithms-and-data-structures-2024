package ru.mirea.practice.s0000001.task2;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title);
    }
}
