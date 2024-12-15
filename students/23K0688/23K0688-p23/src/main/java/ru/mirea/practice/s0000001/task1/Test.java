package ru.mirea.practice.s0000001.task1;

public abstract class Test {
    public static void main(String[] args) {
        Arrayqueueadt<Integer> arrint = new Arrayqueueadt<>();
        Integer[] intarr = {1,2,3};
        arrint.setArr(intarr);
        arrint.print();
        arrint.enqueue(10);
        arrint.print();
        System.out.println("got: " + arrint.dequeue());
        arrint.print();
        //
        Arrayqueueadt<String> arrstr = new Arrayqueueadt<>();
        String[] strarr = {"ok","la","ko"};
        arrstr.setArr(strarr);
        arrstr.print();
        arrstr.enqueue("10");
        arrstr.print();
        System.out.println("got: " + arrstr.dequeue());
        arrstr.print();
        System.out.println("1 element:" + arrstr.getElement());
        System.out.println("size:" + arrstr.getSize());
        System.out.println("empty:" + arrstr.isEmpty());
        arrstr.clear();
        arrstr.print();
        System.out.println("empty:" + arrstr.isEmpty());
    }
}
