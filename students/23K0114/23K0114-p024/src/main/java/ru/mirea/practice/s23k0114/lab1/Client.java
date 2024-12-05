package ru.mirea.practice.s23k0114.lab1;


class Client {
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
