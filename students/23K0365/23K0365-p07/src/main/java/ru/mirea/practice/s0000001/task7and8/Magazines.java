package ru.mirea.practice.s0000001.task7and8;

public class Magazines implements Printable {
    private String title;
    private String author;

    public Magazines(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable x : printable) {
            if (x instanceof Magazines) {
                System.out.println(((Magazines) x).getTitle());
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        System.out.println("Type is magazines. " + "\tAuthor: "
                + author + "\tTitle: " + title);
    }
}