package ru.mirea.practice.s30k0112;

import java.io.IOException;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) throws IOException {
        TwoThreeTree tree = new TwoThreeTree();

        tree.readFromFile("/Users/martin/IdeaProjects/algorithms-and-data-structures-2024/students/23K0112/PROCS.txt");
        tree.processCommands();
    }
}
