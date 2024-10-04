package mirea.lab1.task1;

public class Tester {
    public static void printArrayStudents(Student[] array2Students) {
        for (Student array2Student : array2Students) {
            System.out.println(array2Student.toString() + " ");
        }
    }

    public static void main(String[] args) {
        Student[] arrayStudents = {
            new Student("Boris", 7),
            new Student("Anne", 2),
            new Student("Egor", 1),
            new Student("Gleb", 3),
            new Student("Konstantin", 4),
            new Student("Daniil", 5),
            new Student("Kate", 6),
            new Student("Iosif", 0),
        };
        System.out.println("Массив перед сортировкой:");
        printArrayStudents(arrayStudents);
        System.out.println("Массив после сортировки:");
        SortingStudents sortedArray = new SortingStudents(arrayStudents);
        sortedArray.interSorting();
        printArrayStudents(arrayStudents);
    }
}
