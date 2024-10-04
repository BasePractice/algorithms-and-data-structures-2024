package ru.mirea.practice.s23k0143;

class Magazine implements Printable {
    private String title;
    private int number;

    public Magazine(String title, int number) {
        this.title = title;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title + " - Номер: " + number);
    }
}