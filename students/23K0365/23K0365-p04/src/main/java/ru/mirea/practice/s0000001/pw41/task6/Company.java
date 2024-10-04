package ru.mirea.practice.s0000001.pw41.task6;

public abstract class Company {
    public static void main(String[] args) {
        Employer[] arr = {
            new Employer("a","p",1),
            new Manager("A","P",1,999.999)};
        System.out.println("Employer = Manager: " + arr[1].getIncome(9));
        System.out.println("Employer = Employer: " + arr[0].getIncome(9));
    }
}
