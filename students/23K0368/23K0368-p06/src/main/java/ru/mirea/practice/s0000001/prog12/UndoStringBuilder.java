package ru.mirea.practice.s0000001.prog12;

import java.util.ArrayList;
import java.util.List;

public class UndoStringBuilder {
    private final List<Command> history = new ArrayList<>();

    // Делегирование методов стандартному StringBuilder
    public UndoStringBuilder append(StringBuilder sb, String str) {
        history.add(new AppendCommand(str));
        sb.append(str);
        return this;
    }

    public UndoStringBuilder append(StringBuilder sb, char c) {
        history.add(new AppendCommand(String.valueOf(c)));
        sb.append(c);
        return this;
    }

    public UndoStringBuilder insert(StringBuilder sb, int offset, String str) {
        history.add(new InsertCommand(offset, str));
        sb.insert(offset, str);
        return this;
    }

    public UndoStringBuilder delete(StringBuilder sb, int start, int end) {
        history.add(new DeleteCommand(start, end));
        sb.delete(start, end);
        return this;
    }

    // Undo
    public void undo(StringBuilder sb) {
        if (!history.isEmpty()) {
            Command lastCommand = history.remove(history.size() - 1);
            lastCommand.undo(sb); // Вызов undo на StringBuilder
        }
    }

    // Получение результата
    public String print(StringBuilder sb) {
        return sb.toString();
    }
}