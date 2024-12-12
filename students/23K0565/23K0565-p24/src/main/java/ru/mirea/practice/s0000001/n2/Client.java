package ru.mirea.practice.s0000001.n2;

public class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Sitting on " + chair.getClass().getSimpleName());
    }
}
