package ru.mirea.practice.s23K0135.prog1;

public abstract class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Иван", 13, 12345);
        students[1] = new Student("Петр", 14, 78901);
        students[2] = new Student("Мария", 15, 34567);
        students[3] = new Student("Ольга", 16, 98765);
        students[4] = new Student("Андрей", 17, 45678);

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        Student.printStudents(students);

        // Сортировка массива вставками по iDNumber
        Sort.sort(students);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        Student.printStudents(students);

    }
}
