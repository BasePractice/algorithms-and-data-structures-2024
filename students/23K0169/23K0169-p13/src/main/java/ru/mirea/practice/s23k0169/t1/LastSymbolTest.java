package ru.mirea.practice.s23k0169.t1;

public final class LastSymbolTest {

    private LastSymbolTest() {

    }

    public static void main(String[] args) {
        LastSymbol printer = new LastSymbol();

        String example1 = "I like Java";
        printer.printLastSymbol(example1);

        String example2 = "Hello, World!";
        printer.printLastSymbol(example2);

        String example3 = "";
        printer.printLastSymbol(example3);

        String example4 = null;
        printer.printLastSymbol(example4);
    }
}
