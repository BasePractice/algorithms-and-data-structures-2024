package ru.mirea.practice.s23K0135.prog12;

// Интерфейс для команд
interface Command {
    void execute(StringBuilder sb);

    void undo(StringBuilder sb);
}
