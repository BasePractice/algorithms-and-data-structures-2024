package ru.mirea.practice.s23k0368.prog2;

public class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        if (chair != null) {
            chair.sit();
        } else {
            System.out.println("Выбираем стульчик");
        }
    }
}
