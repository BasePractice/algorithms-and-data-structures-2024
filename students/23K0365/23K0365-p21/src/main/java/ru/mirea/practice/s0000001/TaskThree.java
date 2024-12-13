package ru.mirea.practice.s0000001;

public class TaskThree<T> {
    private T[] anotherArr;

    public TaskThree(T[] anotherArr) {
        this.anotherArr = anotherArr;
    }

    public T getEl(int index) {
        return anotherArr[index];
    }

    public static void main(String[] args) {
        Boolean[] bools = {true,false,true};
        Short[] shortPeople = {-32760,-32761,-32762};
        TaskThree<Boolean> a = new TaskThree(bools);
        TaskThree<Short> b = new TaskThree(shortPeople);
        System.out.println(a.getEl(2));
        System.out.println(b.getEl(2));
    }
}
