package ru.mirea.practice.s23k0155;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGpa {
    private List<Student> iDNumber;

    public SortingStudentsByGpa() {
        iDNumber = new ArrayList<>();
    }

    public void setArray() {
        iDNumber.add(new Student("Том", "Браун", "ИИ", 2, "КВБО-01", 3.1));
        iDNumber.add(new Student("Боб", "Грин", "Мат.", 3, "КАБО-02", 4.9));
        iDNumber.add(new Student("Тэд", "Грей", "Физ.", 1, "ЭФБО-11", 4.0));
        iDNumber.add(new Student("Крис", "Глупый", "Экономика", 1, "ЭКБО-91", 3.1));
    }

    public void quickSort() {
        iDNumber.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    public void mergeSort() {
        iDNumber = mergeSort(iDNumber);
    }

    private List<Student> mergeSort(List<Student> studentList) {
        if (studentList.size() <= 1) {
            return studentList;
        }

        int mid = studentList.size() / 2;
        List<Student> left = mergeSort(studentList.subList(0, mid));
        List<Student> right = mergeSort(studentList.subList(mid, studentList.size()));

        return merge(left, right);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGpa() >= right.get(j).getGpa()) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    // Метод для сортировки по фамилии
    public void sortByLastName() {
        iDNumber.sort(Comparator.comparing(Student::getLastName));
    }

    public static void main(String[] args) {
        SortingStudentsByGpa sorter = new SortingStudentsByGpa();
        sorter.setArray();

        System.out.println("До сортировки по среднему баллу:");
        sorter.outArray();

        sorter.quickSort();
        System.out.println("\nПосле использования быстрой сортировки:");
        sorter.outArray();

        sorter.mergeSort();
        System.out.println("\nПосле использования сортировки слиянием:");
        sorter.outArray();

        sorter.sortByLastName();
        System.out.println("\nОтсортированный список по фамиилии студентов:");
        sorter.outArray();
    }
}
