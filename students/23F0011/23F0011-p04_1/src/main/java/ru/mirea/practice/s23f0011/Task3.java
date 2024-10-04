package ru.mirea.practice.s23f0011;

public class Task3 {
    String fullName;
    int age;

    public Task3() {
        fullName = "Человек без имени";
        age = 0;
    }

    public Task3(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {

        Task3 person1 = new Task3();
        person1.move();
        person1.talk();

        Task3 person2 = new Task3("Наиль Маратович", 30);
        person2.move();
        person2.talk();
    }

    public void move() {
        System.out.println(fullName + " идет.");
    }

    public void talk() {
        System.out.println(fullName + " говорит.");
    }
}
