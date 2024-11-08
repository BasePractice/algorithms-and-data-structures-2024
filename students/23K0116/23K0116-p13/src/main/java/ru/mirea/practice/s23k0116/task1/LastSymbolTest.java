package ru.mirea.practice.s23k0116.task1;

public abstract class LastSymbolTest {
    public static void main(String[] args) {
        LastSymbol printer = new LastSymbol();

        String example1 = "I like Java";
        printer.printLastSymbol(example1);

        String example2 = "";
        printer.printLastSymbol(example2);

        String example3 = null;
        printer.printLastSymbol(example3);
    }
}
