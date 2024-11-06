package ru.mirea.practice.s0000001.task1.task2;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
    }

    public String getTitle() {
        return title;
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Magazine) {
                System.out.println(((Magazine) p).getTitle());
            }
        }
    }
}