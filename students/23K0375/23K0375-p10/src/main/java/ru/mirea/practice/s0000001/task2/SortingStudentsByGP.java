package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGP {
    private List<Student> iDNumber;

    public SortingStudentsByGP() {
        iDNumber = new ArrayList<>();
    }

    // Метод для заполнения массива
    public void setArray(List<Student> students) {
        iDNumber.addAll(students);
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    // Метод для быстрой сортировки по среднему баллу
    public void quicksort() {
        iDNumber.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    // Метод для сортировки слиянием по среднему баллу
    public void mergeSort() {
        iDNumber = mergeSort(iDNumber);
    }

    private List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) {
            return list;
        }

        int middle = list.size() / 2;
        List<Student> left = new ArrayList<>(list.subList(0, middle));
        List<Student> right = new ArrayList<>(list.subList(middle, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).getGpa() >= right.get(rightIndex).getGpa()) {
                result.add(left.get(leftIndex++));
            } else {
                result.add(right.get(rightIndex++));
            }
        }

        result.addAll(left.subList(leftIndex, left.size()));
        result.addAll(right.subList(rightIndex, right.size()));

        return result;
    }

    // Метод для сортировки по имени
    public void sortByName() {
        iDNumber.sort(Comparator.comparing(Student::getFirstName));
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", "Информатика", 2, "ИТ-21", 3.8));
        students.add(new Student("Петр", "Петров", "Математика", 3, "МТ-31", 4.2));
        students.add(new Student("Анна", "Сидорова", "Физика", 1, "Ф-11", 4.5));
        students.add(new Student("Елена", "Смирнова", "Химия", 2, "Х-21", 3.9));

        SortingStudentsByGP sorter = new SortingStudentsByGP();
        sorter.setArray(students);

        System.out.println("До сортировки:");
        sorter.outArray();

        System.out.println("\nПосле быстрой сортировки по GPA:");
        sorter.quicksort();
        sorter.outArray();

        System.out.println("\nПосле сортировки слиянием по GPA:");
        sorter.mergeSort();
        sorter.outArray();

        System.out.println("\nПосле сортировки по имени:");
        sorter.sortByName();
        sorter.outArray();
    }
}