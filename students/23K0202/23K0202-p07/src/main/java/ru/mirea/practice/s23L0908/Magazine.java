package ru.mirea.practice.s23L0908;

public class Magazine implements Printable {
    private final String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
