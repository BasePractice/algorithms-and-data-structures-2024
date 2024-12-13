package ru.mirea.practice.s0000001.num2;

public final class Main {
    private Main() {
        // Приватный конструктор, чтобы предотвратить создание экземпляра
    }

    public static void main(String[] args) {
        Uchashchiesya[] arr = new Uchashchiesya[4];
        arr[0] = new Shkolnik("Иван");
        arr[1] = new Student("Петр");
        arr[2] = new Shkolnik("Мария");
        arr[3] = new Student("Олег");

        System.out.println("Школьники:");
        for (Uchashchiesya u : arr) {
            if (u instanceof Shkolnik) {
                u.show();
            }
        }

        System.out.println("Студенты:");
        for (Uchashchiesya u : arr) {
            if (u instanceof Student) {
                u.show();
            }
        }
    }
}
