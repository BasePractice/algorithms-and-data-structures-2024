package ru.mirea.practice.s23L0908.task1;

class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Magazine: " + title);
    }
}
