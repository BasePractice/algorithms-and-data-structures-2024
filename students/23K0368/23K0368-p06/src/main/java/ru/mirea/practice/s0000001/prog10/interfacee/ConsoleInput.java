package ru.mirea.practice.s0000001.prog10.interfacee;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int readInt() {
        return Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String readLine() {
        return scanner.nextLine();

    }

    @Override
    public double readDouble() {
        return scanner.nextDouble();

    }
}
