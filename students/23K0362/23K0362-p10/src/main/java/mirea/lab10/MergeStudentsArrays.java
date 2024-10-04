package mirea.lab9;

public class MergeStudentsArrays {
    public static void printArrayStudents(Student[] arrayStudents) {
        for (Student arrayStudent : arrayStudents) {
            System.out.println(arrayStudent.toString() + " ");
        }
    }

    public static void main(String[] args) {
        Student[] array1 = {
            new Student("Алексей", "Иванов", "Программист", 3, "ИКБО-01-01", 3.12),
            new Student("Иван", "Иванов", "Аналитик данных", 2, "ИАБО-01-01", 4.5),
            new Student("Евгений", "Рычев", "Инженер", 4, "КАБО-01-01", 5.0)
        };

        Student[] array2 = {
            new Student("Глеб", "Климентов", "Программист", 1, "ИКБО-01-01", 4.1),
            new Student("Клим", "Болгаров", "Робототехник", 1, "КРБО-01-01", 3.0)
        };

        Student[] array3 = new Student[array1.length + array2.length];

        for (int i = 0; i < array1.length + array2.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array2.length];
            }
        }

        System.out.println("Массив студентов до сортировки: ");
        printArrayStudents(array3);
        System.out.println("Массив студентов после сортировки: ");
        SortingStudentsByGpa sortedArray = new SortingStudentsByGpa(array3);
        sortedArray.quickSort(0, array3.length - 1);
        printArrayStudents(array3);
    }
}
