package ru.mirea.practice.s23k0089.task1und2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Sort {
    public static Comparator<Student> compareGpa = Comparator.comparingDouble(Student::getGpa);
    public static Comparator<Student> compareName = Comparator.comparing(Student::getFirstName);
    public static Comparator<Student> compareID = Comparator.comparing(Student::getIdNumber);
    public static Comparator<Student> compareGroup = Comparator.comparing(Student::getGroup);
    public static Comparator<Student> compareAll = compareGpa.reversed().thenComparing(compareID
            .thenComparing(compareGroup.thenComparing(compareName.thenComparing(compareID))));

    public static <T> List<T> quicksort(List<T> array, Comparator<? super T> comparator) {
        if (array.size() <= 1) {
            return array;
        }
        int pivot = array.size() / 2;
        List<T> arraysmall = new ArrayList<>();
        List<T> arraybig = new ArrayList<>();
        for (T item : array) {
            if (item.equals(array.get(pivot))) {
                continue;
            } else if (comparator.compare(array.get(pivot), item) > 0) {
                arraysmall.add(item);
            } else if (comparator.compare(array.get(pivot), item) < 0) {
                arraybig.add(item);
            }
        }
        List<T> arraySorted = quicksort(arraysmall, comparator);
        arraySorted.add(array.get(pivot));
        arraySorted.addAll(quicksort(arraybig, comparator));
        return arraySorted;
    }

    public static <T> List<T> mergeSort(List<T> array, Comparator<? super T> comparator) {
        if (array.size() == 1) {
            return array;
        }
        List<T> arrayright = new ArrayList<>();
        List<T> arrayleft = new ArrayList<>();
        for (int i = 0; i < array.size() / 2; i++) {
            arrayleft.add(array.get(i));
        }
        for (int i = array.size() / 2; i < array.size(); i++) {
            arrayright.add(array.get(i));
        }
        arrayleft = mergeSort(arrayleft, comparator);
        arrayright = mergeSort(arrayright, comparator);

        ArrayList<T> arraySorted = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < arrayleft.size() && j < arrayright.size()) {
            if (comparator.compare(arrayleft.get(i), arrayright.get(j)) <= 0) {
                arraySorted.add(arrayleft.get(i));
                i++;
            } else if (comparator.compare(arrayleft.get(i), arrayright.get(j)) > 0) {
                arraySorted.add(arrayright.get(j));
                j++;
            }
        }
        if (i >= arrayleft.size()) {
            while (j < arrayright.size()) {
                arraySorted.add(arrayright.get(j));
                j++;
            }
        } else {
            while (i < arrayleft.size()) {
                arraySorted.add(arrayleft.get(i));
                i++;
            }
        }
        return arraySorted;
    }

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2, Comparator<? super T> comparator) {
        List<T> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        return mergeSort(list, comparator);
    }
}
