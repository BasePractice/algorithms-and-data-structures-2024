package ru.mirea.practice.s23L0908;

public final class Ex1 {

    private Ex1() {
        // По традиции ничего нет
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(3, "Маша",0),
            new Student(1, "Саша",0),
            new Student(2, "Паша",0)
        };

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        InsertionSort.sort(students);

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
