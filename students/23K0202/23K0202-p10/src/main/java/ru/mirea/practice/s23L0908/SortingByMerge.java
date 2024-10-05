package ru.mirea.practice.s23L0908;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public abstract class SortingByMerge {
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {

        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        mergedList.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        return mergedList;
    }

    public static void main(String[] args) {

        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Aleksandr", "Pushkin", "Computer Science", 2, "KVBO-01", 4.8));
        list1.add(new Student("Lev", "Tolstoy", "Artificial Intelegence", 1, "KABO-03", 3.1));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Sergey", "Esenin", "Programming", 2, "KBB0-04", 2.9));
        list2.add(new Student("Ivan", "Turgenev", "Physics", 4, "KKCO-02", 5.0));

        List<Student> mergedList = mergeSort(list1, list2);

        System.out.println("Merged and sorted student list:");
        for (Student student : mergedList) {
            System.out.println(student);
        }

    }
}
