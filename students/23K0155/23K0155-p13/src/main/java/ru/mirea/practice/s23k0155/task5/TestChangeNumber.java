package ru.mirea.practice.s23k0155.task5;

public abstract class TestChangeNumber {
    public static void main(String[] args) {
        ChangeNumber tester1 = new ChangeNumber("89254565235");
        System.out.println(tester1.toSTring());
        ChangeNumber tester2 = new ChangeNumber("+78005553535");
        System.out.println(tester2.toSTring());
        ChangeNumber tester3 = new ChangeNumber("+4590036542345");
        System.out.println(tester3.toSTring());
    }
}
