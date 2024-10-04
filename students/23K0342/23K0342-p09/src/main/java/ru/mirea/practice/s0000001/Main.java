package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}

public class Main {

    // Метод для слияния двух отсортированных списков студентов
    public static List<Student> merge(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Слияние двух списков
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).age <= list2.get(j).age) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Добавляем оставшиеся элементы из первого списка
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Добавляем оставшиеся элементы из второго списка
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 20));
        list1.add(new Student("Bob", 22));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Charlie", 21));
        list2.add(new Student("David", 23));

        List<Student> sortedMergedList = merge(list1, list2);

        System.out.println("Объединенный и отсортированный список студентов:");
        for (Student student : sortedMergedList) {
            System.out.println(student);
        }
    }
}
