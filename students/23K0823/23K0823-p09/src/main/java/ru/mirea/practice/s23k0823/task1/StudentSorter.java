package ru.mirea.practice.s23k0823.task1;

abstract class StudentSorter {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Иван Иванов", 123),
            new Student("Петр Петров", 456),
            new Student("Сергей Сергеев", 789),
            new Student("Алексей Алексеев", 101),
            new Student("Дмитрий Дмитриев", 234)
        };

        System.out.println("До сортировки:");
        printStudents(students);

        Sorting.insertionSort(students);

        System.out.println("После сортировки:");
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
