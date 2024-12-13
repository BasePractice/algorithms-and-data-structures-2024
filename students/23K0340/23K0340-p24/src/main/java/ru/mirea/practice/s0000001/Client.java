package ru.mirea.practice.s0000001;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("sit");
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
