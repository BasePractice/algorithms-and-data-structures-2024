package ru.mirea.practice.lab27.t1;

public class Element implements Comparable<Element> {
    private final String name;
    private final int priority;

    public Element(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Element other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

