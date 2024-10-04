package ru.mirea.practice.s23f0011;

public class MergeSortedStudentLists {
    private Student[] students;
    private int size;

    public MergeSortedStudentLists(int initialCapacity) {
        students = new Student[initialCapacity];
        size = 0;
    }

    public void add(Student student) {
        if (size == students.length) {
            resize();
        }
        students[size++] = student;
    }

    private void resize() {
        Student[] temp = new Student[students.length * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = students[i];
        }
        students = temp;
    }

    public static Student[] merge(Student[] arr1, Student[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        Student[] mergedArr = new Student[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i].getGpa() >= arr2[j].getGpa()) { // Сортировка по убыванию GPA
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            mergedArr[k++] = arr1[i++];
        }

        while (j < n2) {
            mergedArr[k++] = arr2[j++];
        }

        return mergedArr;
    }

    public static void main(String[] args) {
        Student[] arr1 = new Student[]{
            new Student("Иван", "Иванов", "Информатика", 3, "ИВТ-31", 3.5),
            new Student("Петр", "Петров", "Математика", 2, "МТ-22", 3.0)
        };

        Student[] arr2 = new Student[]{
            new Student("Мария", "Сидорова", "Физика", 1, "Ф-11", 4.0),
            new Student("Ольга", "Козлова", "Химия", 4, "Х-41", 3.8)
        };

        Student[] mergedArr = merge(arr1, arr2);

        System.out.println("Объединенный список студентов:");
        for (Student student : mergedArr) {
            System.out.println(student);
        }
    }
}