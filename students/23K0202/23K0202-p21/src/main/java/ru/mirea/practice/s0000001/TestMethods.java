package ru.mirea.practice.s0000001;

import java.util.List;

public final class TestMethods {
    private TestMethods() {

    }

    public static void main(String[] args) {
        String[] stringArray = {"один", "два", "три"};
        List<String> stringList = ArrayToListConverter.convertArrayToList(stringArray);
        System.out.println(stringList);

        System.out.println(IndexGetter.getElement(stringArray, 0));
        System.out.println(IndexGetter.getElement(stringArray, 1));
    }
}
