package ru.mirea.practice.s23L0908.pw41.task5;

public class Reader {
    private String fullName;
    int chitBil;
    String facultet;
    String birth;
    int number;

    public void takeBook(int countOfBooks) {
        System.out.println(this.fullName + " take " + countOfBooks + " books");
    }

    public void takebook(Book...books) {
        System.out.print(this.fullName + " take ");
        for (Book x : books) {
            System.out.print(x.getTitle() + ", ");
        }
        System.out.println();
    }

    public void returnBook(int countOfBooks) {
        System.out.println(this.fullName + " return " + countOfBooks + " books");
    }

    public void returnbook(Book...books) {
        System.out.print(this.fullName + " return ");
        for (Book x : books) {
            System.out.print(x.getTitle() + ", ");
        }
        System.out.println();
    }

    public Reader(String fullName, int chitBil, String facultet, String birth, int number) {
        this.fullName = fullName;
        this.chitBil = chitBil;
        this.facultet = facultet;
        this.birth = birth;
        this.number = number;
    }
}
