package ru.mirea.practice.s23l0908.Task6_7_8_9;

public class Test {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book(2000, "Sherlock Holmes");
        printables[1] = new Shop("Games", 11111);
        for (int i = 0; i < 2; i++)
            printables[i].print();
    }
}
