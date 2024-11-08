package ru.mirea.practice.s0000001.task2;

public abstract class LabClassDriver {
    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        Student[] ar = {
            new Student("q", "w", "e", 2, "t", 12),
            //new Student("", "", "e", 2, "t", 12),
            new Student("Q", "w", "e", 1, "t", 34),
            new Student("qQ", "w", "e", 4, "t", 6),
        };
        LabClassUI a = new LabClassUI();
        a.setArray(ar);
        a.setIDnumber(a.sortByGPa(a.getIDnumber(), 0, a.getIDnumber().length - 1));
        a.outArray();
        System.out.println();
        System.out.println(a.findByName("q"));//"R"));//"2"));
        System.out.println(a.findByGpa(34));//12))
    }
}
