package ru.mirea.practice.s23K0135;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    private List<Student> students;

    public Main() {
        this.students = new ArrayList<>();
    }

    public void setArray(int option) {
        if (option == 1) {
            students.add(new Student("Алиса", "Пупыркина", "Информатика", 2, "Группа 1", 4.5));
            students.add(new Student("Павел", "Загребин", "Физика", 2, "Группа 1", 3.8));
            students.add(new Student("Фёдор", "Фломастерин", "Математика", 3, "Группа 1", 4.2));
        } else if (option == 2) {
            students.add(new Student("Сергей", "Сергеев", "Биология", 1, "Группа 2", 4.7));
            students.add(new Student("Мария", "Маркова", "Химия", 2, "Группа 2", 3.9));
            students.add(new Student("Ольга", "Олегова", "Физика", 3, "Группа 2", 4.5));
        }
    }

    public void quicksort() {
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void sortByLastName() {
        students.sort(Comparator.comparing(Student::getLastName));
    }

    public void sortByFirstName() {
        students.sort(Comparator.comparing(Student::getFirstName));
    }

    public void sortBySpecialty() {
        students.sort(Comparator.comparing(Student::getSpecialty));
    }

    public static List<Student> mergeAndSortLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        mergedList.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        return mergedList;
    }

    public static void main(String[] args) {
        Main sortingGroup1 = new Main();
        sortingGroup1.setArray(1);

        Main sortingGroup2 = new Main();
        sortingGroup2.setArray(2);

        System.out.println("Список студентов из первой группы:");
        sortingGroup1.outArray();

        System.out.println("Список студентов из второй группы:");
        sortingGroup2.outArray();

        sortingGroup1.sortByFirstName();
        System.out.println("\nСписок студентов из первой группы отсортированный по имени:");
        sortingGroup1.outArray();

        sortingGroup2.sortBySpecialty();
        System.out.println("\nСписок студентов из второй группы отсортированный по специальности:");
        sortingGroup2.outArray();

        List<Student> mergedList = mergeAndSortLists(sortingGroup1.students, sortingGroup2.students);
        System.out.println("\nОбъединенный и отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
