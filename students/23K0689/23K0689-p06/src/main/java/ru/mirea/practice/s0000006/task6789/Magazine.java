package ru.mirea.practice.s0000006.task6789;

public class Magazine implements Printable {
    private String title;
    private String issue;

    public Magazine(String title, String issue) {
        this.title = title;
        this.issue = issue;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title + ", Issue: " + issue);
    }
}
