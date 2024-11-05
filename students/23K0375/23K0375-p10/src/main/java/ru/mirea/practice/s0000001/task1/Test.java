package ru.mirea.practice.s0000001.task1;

public abstract class Test {
    public static void main(String[] args) {
        // Создание объекта Student
        Student student = new Student("Иван", "Иванов", "Информатика", 2, "КАБО-10-23");
        System.out.println(student);

        // Изменение данных студента
        student.setCourse(3);
        student.setGroup("КАБО-01-23");
        System.out.println(student);
    }
}
