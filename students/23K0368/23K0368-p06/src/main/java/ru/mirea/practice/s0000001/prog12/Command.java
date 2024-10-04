package ru.mirea.practice.s0000001.prog12;

// Интерфейс для команд
interface Command {
    void execute(StringBuilder sb);

    void undo(StringBuilder sb);
}
