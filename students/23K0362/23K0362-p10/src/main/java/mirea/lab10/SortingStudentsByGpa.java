package mirea.lab9;

public class SortingStudentsByGpa {
    private final Student[] array;

    SortingStudentsByGpa(Student[] inputArray) {
        array = inputArray;
    }

    void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);

            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        Student pivot = array[high];
        int i = (low - 1);
        Student temp;
        for (int j = low; j < high; j++) {
            if (array[j].getGpa() < pivot.getGpa()) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
