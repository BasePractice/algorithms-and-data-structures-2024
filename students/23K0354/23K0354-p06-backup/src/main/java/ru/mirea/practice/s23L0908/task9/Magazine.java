package ru.mirea.practice.s23L0908.task9;

class Magazine implements Printable {
    private final String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title);
    }
}
