package ru.mirea.practice.s23L0908.task1;

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