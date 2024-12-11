package ru.mirea.practice.pr9;

public abstract class TestStudent {

    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student(169, "Georgy");
        students[1] = new Student(180, "Ivan");
        students[2] = new Student(190, "Anatoly");
        students[3] = new Student(251, "Lev");
        students[4] = new Student(678, "Leo");
        students[5] = new Student(679, "Inga");

        System.out.println("Before sorting:");
        printStudents(students);

        insertionSort(students);

        System.out.println("\nAfter sorting by iDNumber:");
        printStudents(students);
    }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIdNumber() > key.getIdNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
