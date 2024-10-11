package ru.mirea.practice.s23k0565.n3;

import java.util.ArrayList;
import java.util.List;

public final class MergeStudentLists {

    private MergeStudentLists() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static List<Student> merge(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Иван", "Иванов", 3.5));
        list1.add(new Student("Петр", "Петров", 4.0));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Светлана", "Сидорова", 4.5));
        list2.add(new Student("Алексей", "Алексеев", 3.8));

        List<Student> mergedList = merge(list1, list2);
        mergedList.forEach(student -> {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ", GPA: " + student.getGPa());
        });
    }
}