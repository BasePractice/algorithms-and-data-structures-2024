package ru.mirea.practice.lab9.gpasort;

public abstract class TestSortOfStudents {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Дмитрий", 4.5),
            new Student("Евфратий", 3.9),
            new Student("Александрус", 2.8),
            new Student("Дарьяна", 3.2),
            new Student("Жаннетта", 4.0)
        };

        SortStudentsByGpA comparator = new SortStudentsByGpA();

        QuickSort.quickSort(students, 0, students.length - 1, comparator);

        System.out.println("Отсортированный список студентов по итоговым баллам (GPA):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
