package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.List;

public class Converter {

    public List<String> starrtolist(String[] starr) {
        List<String> list = new ArrayList<>();
        for (String st : starr) {
            list.add(st);
        }
        return list;
    }

    public List<Integer> intarrtolist(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }
}
