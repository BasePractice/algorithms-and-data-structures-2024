package ru.mirea.practice.s23k0155;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class MergeStudentLists {
    public static List<Student> merge(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        mergedList.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Том", "Браун", "ИИ", 2, "КВБО-01", 4.5));
        list1.add(new Student("Боб", "Грин", "Мат.", 3, "КАБО-02", 4.9));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Тэд", "Грей", "Физ.", 1, "ЭФБО-11", 4.0));
        list2.add(new Student("Крис", "Глупый", "Экономика", 1, "ЭКБО-91", 3.1));

        List<Student> mergedList = merge(list1, list2);

        System.out.println("Merged and sorted list:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
