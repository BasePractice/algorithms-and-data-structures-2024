package mirea.lab1.task1;

public class SortingStudents {
    private final Student[] arrayStudents;

    SortingStudents(Student[] inputArray) {
        arrayStudents = inputArray;
    }

    void interSorting() {
        for (int i = 1; i < arrayStudents.length; ++i) {
            Student key = arrayStudents[i];
            int j = i - 1;
            while (j >= 0 && arrayStudents[j].getiDNumber() > key.getiDNumber()) {
                arrayStudents[j + 1] = arrayStudents[j];
                j = j - 1;
            }
            arrayStudents[j + 1] = key;
        }
    }

    public void printArray() {
        for (Student arrayStudent : arrayStudents) {
            System.out.println(arrayStudent.toString());
        }
    }
}
