package ru.mirea.practice.s230k754.lab11.task2;

public class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Sitting on " + chair.getClass().getSimpleName());
    }
}
