package ru.mirea.practice.s23k0823.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGpa {
    private List<Student> iDNumber;

    public SortingStudentsByGpa() {
        iDNumber = new ArrayList<>();
    }

    public void setArray(Student[] students) {
        iDNumber.clear();
        for (Student student : students) {
            iDNumber.add(student);
        }
    }

    public void quicksort() {
        iDNumber.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGpa(), s1.getGpa());
            }
        });
    }

    public void mergeSort() {
        iDNumber = mergeSort(iDNumber);
    }

    private List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Student> left = list.subList(0, mid);
        List<Student> right = list.subList(mid, list.size());

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGpa() > right.get(j).getGpa()) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));

        return result;
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println("Имя: " + student.getName());
            System.out.println("Фамилия: " + student.getSurname());
            System.out.println("Специальность: " + student.getSpecialty());
            System.out.println("Курс: " + student.getCourse());
            System.out.println("Группа: " + student.getGroup());
            System.out.println("Средний балл: " + student.getGpa());
            System.out.println();
        }
    }

    public void sortByField(String field) {
        Comparator<Student> comparator = null;
        if ("name".equals(field)) {
            comparator = new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return s1.getName().compareTo(s2.getName());
                }
            };
        } else if ("surname".equals(field)) {
            comparator = new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return s1.getSurname().compareTo(s2.getSurname());
                }
            };
        } else if ("specialty".equals(field)) {
            comparator = new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return s1.getSpecialty().compareTo(s2.getSpecialty());
                }
            };
        } else if ("course".equals(field)) {
            comparator = new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return Integer.compare(s1.getCourse(), s2.getCourse());
                }
            };
        } else if ("group".equals(field)) {
            comparator = new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return s1.getGroup().compareTo(s2.getGroup());
                }
            };
        }
        iDNumber.sort(comparator);
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Иван", "Иванов", "Информатика", 2, "А", 4.5);
        students[1] = new Student("Анастасия", "Петрова", "Математика", 3, "Б", 4.2);
        students[2] = new Student("Екатерина", "Смирнова", "Биология", 1, "В", 4.8);
        students[3] = new Student("Дмитрий", "Кузнецов", "Физика", 4, "Г", 4.1);
        students[4] = new Student("Светлана", "Лебедева", "Химия", 5, "Д", 4.6);

        SortingStudentsByGpa sorter = new SortingStudentsByGpa();
        sorter.setArray(students);
        sorter.outArray();

        System.out.println("Сортировка по среднему баллу в порядке убывания:");
        sorter.quicksort();
        sorter.outArray();

        System.out.println("Сортировка по среднему баллу в порядке убывания с помощью сортировки слиянием:");
        sorter.mergeSort();
        sorter.outArray();

        System.out.println("Сортировка по имени:");
        sorter.sortByField("name");
        sorter.outArray();

        System.out.println("Сортировка по фамилии:");
        sorter.sortByField("surname");
        sorter.outArray();

        System.out.println("Сортировка по специальности:");
        sorter.sortByField("specialty");
        sorter.outArray();

        System.out.println("Сортировка по курсу:");
        sorter.sortByField("course");
        sorter.outArray();

        System.out.println("Сортировка по группе:");
        sorter.sortByField("group");
        sorter.outArray();
    }
}
