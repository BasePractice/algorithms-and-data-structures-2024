package ru.mirea.practice.s23k0169.t1;

public final class StudentTest {

    private StudentTest() {

    }

    public static void insertionSort(Student[] students) {

        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getidNumber() > key.getidNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{new Student(3, "Alice"), new Student(1, "Charlie"),
            new Student(2, "Bob")};

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
