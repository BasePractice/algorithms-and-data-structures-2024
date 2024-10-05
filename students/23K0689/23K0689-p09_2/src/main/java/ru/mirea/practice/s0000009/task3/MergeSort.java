package ru.mirea.practice.s0000009.task3;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public List<Student> merge(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        // Слияние двух списков в один отсортированный
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGpa() >= list2.get(j).getGpa()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Добавление оставшихся элементов из list1
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Добавление оставшихся элементов из list2
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
