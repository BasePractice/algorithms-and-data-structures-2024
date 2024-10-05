package ru.mirea.practice.s23L0908;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class StudentSort {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].idNumber > key.idNumber) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    static class SortingByFG implements Comparator<Student> {

        public int compare(Student s1, Student s2) {
            return Double.compare(s2.finalGrade, s1.finalGrade);
        }

        public void quickSort(Student[] array, int low, int high) {
            if (low < high) {
                int pi = partition(array, low, high);
                quickSort(array, low, pi - 1);
                quickSort(array, pi + 1, high);
            }
        }

        private int partition(Student[] array, int low, int high) {
            Student pivot = array[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (compare(array[j], pivot) > 0) {
                    i++;
                    Student temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            Student temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            return i + 1;
        }


        public static List<Student> merge(List<Student> list1, List<Student> list2) {
            List<Student> mergedList = new ArrayList<>();
            int n = 0;
            int m = 0;
            while (n < list1.size() && m < list2.size()) {
                if (list1.get(n).finalGrade < list2.get(m).finalGrade) {
                    mergedList.add(list1.get(n));
                    n++;
                } else {
                    mergedList.add(list2.get(m));
                    m++;
                }
            }
            while (n < list1.size()) {
                mergedList.add(list1.get(n));
                n++;
            }
            while (m < list2.size()) {
                mergedList.add(list2.get(m));
                m++;
            }
            return mergedList;
        }


        public static List<Student> mergeSort(List<Student> students) {
            if (students.size() <= 1) {
                return students;
            }

            int mid = students.size() / 2;

            List<Student> left = mergeSort(students.subList(0, mid));
            List<Student> right = mergeSort(students.subList(mid, students.size()));

            return merge(left, right);
        }



        public static void main(String[] args) {
            Student[] students = {new Student(1, "Anna", 3.5),
                new Student(4, "Ivan", 5.0), new Student(2, "Sasha", 4.3),
                new Student(5, "Petr", 2.7), new Student(3, "Victoria", 4.75)};

            System.out.println("Before: ");
            for (Student student : students) {
                System.out.println(student);
            }

            insertionSort(students);

            System.out.println("\nAfter sorting by ID: ");
            for (Student student : students) {
                System.out.println(student);
            }

            SortingByFG sorter = new SortingByFG();
            sorter.quickSort(students, 0, students.length - 1);

            System.out.println("\nAfter sorting by Final Grade:");
            for (Student student : students) {
                System.out.println(student);
            }

            List<Student> list1 = new ArrayList<>();
            list1.add(new Student(1,"Vlad", 3.0));
            list1.add(new Student(2,"Anton", 4.5));

            List<Student> list2 = new ArrayList<>();
            list2.add(new Student(3, "Karina", 3.8));
            list2.add(new Student(4, "Masha", 5.0));

            List<Student> combinedList = new ArrayList<>(list1);
            combinedList.addAll(list2);

            List<Student> sortedList = mergeSort(combinedList);

            // Вывод отсортированного списка студентов
            System.out.println("\nSorted Student List: ");
            for (Student student : sortedList) {
                System.out.println(student);
            }

        }
    }
}
