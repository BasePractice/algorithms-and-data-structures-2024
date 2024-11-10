package ru.mirea.practice.u23k1158.t1;

public final class TestStudent {

    private TestStudent() {

    }

    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student("Полина", 5);
        students[1] = new Student("Наташа", 3);
        students[2] = new Student("Елизавета", 4);
        students[3] = new Student("Антон", 2);
        students[4] = new Student("Амаль", 1);

        System.out.println("Перед сортировкой:");
        for (Student student : students) {
            System.out.println(student);
        }

        Sorter.insertionSort(students);

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
