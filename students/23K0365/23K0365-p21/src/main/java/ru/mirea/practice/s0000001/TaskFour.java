package ru.mirea.practice.s0000001;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TaskFour<T> {
    List<T> myLst = new LinkedList<>();

    public void saveCatalog(T... args) {
        myLst.addAll(Arrays.asList(args));
    }

    public void getFive() {
        for (int i = 0; i < 5; i++) {
            System.out.print(myLst.get(i) + "   ");
        }
    }

    public static void main(String[] args) {
        TaskFour<Boolean> a = new TaskFour<>();
        a.saveCatalog(true,false,true,true,true,false,
                true,true,false,true,true,true,false,true);
        a.getFive();
    }
}
