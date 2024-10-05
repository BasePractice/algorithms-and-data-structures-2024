package ru.mirea.practice.s23L0908.prog13;

import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder {
    private final List<Observer> observers = new ArrayList<>();

    // Делегирование методов стандартному StringBuilder
    public ObservableStringBuilder append(StringBuilder sb, String str) {
        sb.append(str);
        notifyObservers(sb); // оповещение после добавления
        return this;
    }

    public ObservableStringBuilder append(StringBuilder sb, char c) {
        sb.append(c);
        notifyObservers(sb); // оповещение после добавления
        return this;
    }

    public ObservableStringBuilder insert(StringBuilder sb, int offset, String str) {
        sb.insert(offset, str);
        notifyObservers(sb); // оповещение после вставки
        return this;
    }

    public ObservableStringBuilder delete(StringBuilder sb, int start, int end) {
        sb.delete(start, end);
        notifyObservers(sb); // оповещение после удаления
        return this;
    }

    // Добавление наблюдателя
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Удаление наблюдателя
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Оповещение наблюдателей
    private void notifyObservers(StringBuilder sb) {
        for (Observer observer : observers) {
            observer.update(sb,this);
        }
    }

    // Получение результата
    public String print(StringBuilder sb) {
        return sb.toString();
    }
}
