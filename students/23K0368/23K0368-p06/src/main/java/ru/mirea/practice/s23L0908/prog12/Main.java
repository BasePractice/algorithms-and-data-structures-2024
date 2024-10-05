package ru.mirea.practice.s23L0908.prog12;

public abstract class Main {
    public static void main(String[] args) {
        UndoStringBuilder undoBuilder = new UndoStringBuilder();
        StringBuilder sb = new StringBuilder("Hello ");
        undoBuilder.append(sb,"world!");
        undoBuilder.append(sb," and ");
        System.out.println(undoBuilder.print(sb));

        undoBuilder.undo(sb);
        System.out.println(undoBuilder.print(sb));

        undoBuilder.undo(sb);
        System.out.println(undoBuilder.print(sb));
    }
}

