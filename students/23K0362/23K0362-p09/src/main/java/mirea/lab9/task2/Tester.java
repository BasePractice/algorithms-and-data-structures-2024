package mirea.lab1.task2;

public class Tester {
    public static void printArrayStudents(Student[] array2Students) {
        for (Student array2Student : array2Students) {
            System.out.println(array2Student.toString() + " ");
        }
    }

    public static void main(String[] args) {
        Student[] arrayStudents = {
            new Student("Boris", 3.23),
            new Student("Anne", 2.23),
            new Student("Egor", 1.999),
            new Student("Gleb", 5.0),
            new Student("Konstantin", 4.42),
            new Student("Daniil", 3.23),
            new Student("Kate", 4.2),
            new Student("Iosif", 4.5),
        };

        System.out.println("Массив студентов до сортировки: ");
        printArrayStudents(arrayStudents);
        System.out.println("Массив студентов после сортировки: ");
        SortingStudentsByGpa sortedArray = new SortingStudentsByGpa(arrayStudents);
        sortedArray.quickSort(0, arrayStudents.length - 1);
        printArrayStudents(arrayStudents);
    }
}
