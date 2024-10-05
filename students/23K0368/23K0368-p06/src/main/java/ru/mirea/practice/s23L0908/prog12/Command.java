package ru.mirea.practice.s23L0908.prog12;

// Интерфейс для команд
interface Command {
    void execute(StringBuilder sb);

    void undo(StringBuilder sb);
}
