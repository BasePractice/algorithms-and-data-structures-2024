package ru.mirea.practice.s0000001.n56;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Employer[] employees = new Employer[3];
        employees[0] = new Employer("Андрей", "Иванов", 50000);
        employees[1] = new Manager("Мария", "Петрова", 60000, 5000);
        employees[2] = new Manager("Сергей", "Кузнецов", 70000, 10000);

        for (Employer emp : employees) {
            System.out.println(emp);
        }
    }
}
