package ru.mirea.practice.s0000001;

public class TaskTwo<T> {
    private T[] urArr;

    public TaskTwo(T[] urArr) {
        this.urArr = urArr;
    }

    public void knowType() {
        System.out.println(urArr.getClass().getName());
    }

    public static void main(String[] args) {
        String[] strs = {"q","qw","qwe","qwer"};
        Integer[] ints = {1,2,3,4,5};
        Boolean[] bools = {true,false,true};
        Short[] shortPeople = {-32760,-32761,-32762};
        TaskTwo a = new TaskTwo(strs);
        TaskTwo b = new TaskTwo(ints);
        TaskTwo c = new TaskTwo(bools);
        final TaskTwo d = new TaskTwo(shortPeople);
        a.knowType();
        b.knowType();
        c.knowType();
        d.knowType();
    }
}
