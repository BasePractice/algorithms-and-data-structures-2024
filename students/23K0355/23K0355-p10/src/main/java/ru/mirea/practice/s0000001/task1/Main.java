package ru.mirea.practice.s0000001.task1;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        Student s = new Student("Дмитрий", "Макаров", "Информатика", 2, "А");

        System.out.println("Имя: " + s.getFn());
        System.out.println("Фамилия: " + s.getLn());
        System.out.println("Специальность: " + s.getMj());
        System.out.println("Курс: " + s.getYr());
        System.out.println("Группа: " + s.getGp());
    }
}