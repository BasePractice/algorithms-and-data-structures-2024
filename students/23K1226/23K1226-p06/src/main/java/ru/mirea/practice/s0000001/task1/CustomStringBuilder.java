package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.List;

class CustomStringBuilder {
    private String currentString;
    private List<String> history;

    public CustomStringBuilder() {
        currentString = "";
        history = new ArrayList<>();
    }

    public void append(String str) {
        history.add(currentString);
        currentString += str;
    }

    public void undo() {
        if (!history.isEmpty()) {
            currentString = history.remove(history.size() - 1);
        }
    }

    @Override
    public String toString() {
        return currentString;
    }
}
