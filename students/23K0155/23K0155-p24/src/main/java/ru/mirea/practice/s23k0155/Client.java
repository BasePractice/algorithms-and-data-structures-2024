package ru.mirea.practice.s23k0155;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("Вы сидите на стуле");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Chair getChair() {
        return chair;
    }
}
