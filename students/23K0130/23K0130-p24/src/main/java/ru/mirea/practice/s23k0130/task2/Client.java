package ru.mirea.practice.s23k0130.task2;

public class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        if (chair != null) {
            chair.sit();
        } else {
            System.out.println("Стул не выбран");
        }
    }
}