package ru.mirea.practice.s23k0143;

public abstract class StudentTest {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Алиса", 90),
            new Student("Петя", 45),
            new Student("Паша", 70),
            new Student("Катя", 64),
            new Student("Игнат", 20)
        };

        SortingStudents comparator = new SortingStudents();
        QuickSort.sort(students, comparator);

        System.out.println("Студенты отсортированы по итоговым баллам (GPA) в порядке убывания:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
