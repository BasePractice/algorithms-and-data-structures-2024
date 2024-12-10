package ru.mirea.practice.s0000001;

import java.io.IOException;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) throws IOException {
        TwoThreeTree tree = new TwoThreeTree();

        tree.readFromFile("C:\\Users\\Msi\\IdeaProjects\\algorithms-and-data-structures-2024\\students\\23K0202"
            + "\\23K0202-p31\\src\\main\\java\\ru\\mirea\\practice\\s0000001\\PROCS.txt");
        tree.processCommands();
    }
}
