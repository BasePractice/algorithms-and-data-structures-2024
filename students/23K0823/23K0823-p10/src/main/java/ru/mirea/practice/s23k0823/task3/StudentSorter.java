package ru.mirea.practice.s23k0823.task3;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentSorter {
    public static void quicksort(List<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quicksort(students, low, pi - 1);
            quicksort(students, pi + 1, high);
        }
    }

    private static int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students.get(j).getGpa() > pivot.getGpa()) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }

    public static void mergeSort(List<Student> students) {
        if (students.size() <= 1) {
            return;
        }

        int mid = students.size() / 2;
        List<Student> left = new ArrayList<>(students.subList(0, mid));
        List<Student> right = new ArrayList<>(students.subList(mid, students.size()));

        mergeSort(left);
        mergeSort(right);

        merge(left, right, students);
    }

    private static void merge(List<Student> left, List<Student> right, List<Student> students) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGpa() > right.get(j).getGpa()) {
                students.set(k, left.get(i));
                i++;
            } else {
                students.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            students.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            students.set(k, right.get(j));
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Иван", "Иванов", "Математика", 2, "А", 3.9));
        students1.add(new Student("Петр", "Петров", "Физика", 3, "Б", 3.7));
        students1.add(new Student("Сергей", "Сергеев", "Информатика", 1, "В", 4.0));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Анна", "Аннова", "Биология", 2, "А", 3.8));
        students2.add(new Student("Мария", "Маринова", "Химия", 3, "Б", 3.6));
        students2.add(new Student("Елена", "Еленова", "Медицина", 1, "В", 3.9));

        quicksort(students1, 0, students1.size() - 1);
        quicksort(students2, 0, students2.size() - 1);

        List<Student> allStudents = new ArrayList<>(students1);
        allStudents.addAll(students2);

        mergeSort(allStudents);

        System.out.println("Объединенный и отсортированный список студентов:");
        for (Student student : allStudents) {
            System.out.println(student.toString());
        }
    }
}
