package ru.mirea.practice.s23f0011;

public class SortingStudentsByGpa {
    private Student[] students;
    private int size; // Текущий размер массива

    public SortingStudentsByGpa(int initialCapacity) {
        students = new Student[initialCapacity];
        size = 0;
    }

    // Заполнение массива
    public void setArray(Student[] students) {
        this.students = students;
        size = students.length;
    }

    // Сортировка по среднему баллу (QuickSort)
    public void quickSort() {
        quickSort(0, size - 1);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        Student pivot = students[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (students[j].getGpa() >= pivot.getGpa()) { // Сортировка по убыванию GPA
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

    // Сортировка по среднему баллу (MergeSort)
    public void mergeSort() {
        students = mergeSort(0, size - 1);
    }

    private Student[] mergeSort(int low, int high) {
        if (low == high) {
            return new Student[] {students[low]};
        }
        int mid = low + (high - low) / 2;
        Student[] left = mergeSort(low, mid);
        Student[] right = mergeSort(mid + 1, high);
        return merge(left, right);
    }

    private Student[] merge(Student[] left, Student[] right) {
        Student[] merged = new Student[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].getGpa() >= right[j].getGpa()) { // Сортировка по убыванию GPA
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
        while (i < left.length) {
            merged[k++] = left[i++];
        }
        while (j < right.length) {
            merged[k++] = right[j++];
        }
        return merged;
    }

    // Вывод массива
    public void outArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void sortByLastName() {
        for (int i = 1; i < size; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getLastName().compareTo(key.getLastName()) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGpa sorter = new SortingStudentsByGpa(3); // Инициализируем с начальной емкостью 3

        Student student1 = new Student("Иван", "Иванов", "Информатика", 3, "ИВТ-31", 3.5);
        Student student2 = new Student("Петр", "Петров", "Математика", 2, "МТ-22", 3.0);
        Student student3 = new Student("Мария", "Сидорова", "Физика", 1, "Ф-11", 4.0);

        sorter.setArray(new Student[]{student1, student2, student3});

        // Сортировка по среднему баллу (QuickSort)
        System.out.println("Сортировка по среднему баллу (QuickSort):");
        sorter.quickSort();
        sorter.outArray();

        // Сортировка по среднему баллу (MergeSort)
        System.out.println("nСортировка по среднему баллу (MergeSort):");
        sorter.mergeSort();
        sorter.outArray();

        // Сортировка по Фамилии
        System.out.println("nСортировка по Фамилии:");
        sorter.sortByLastName();
        sorter.outArray();
    }
}