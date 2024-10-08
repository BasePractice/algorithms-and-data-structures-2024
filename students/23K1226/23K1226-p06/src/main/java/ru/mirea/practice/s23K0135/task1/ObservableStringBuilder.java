package ru.mirea.practice.s23K0135.task1;

import java.util.ArrayList;
import java.util.List;

class ObservableStringBuilder {
    private String currentString;
    private List<Observer> observers;

    public ObservableStringBuilder() {
        currentString = "";
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void append(String str) {
        currentString += str;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentString);
        }
    }
}
