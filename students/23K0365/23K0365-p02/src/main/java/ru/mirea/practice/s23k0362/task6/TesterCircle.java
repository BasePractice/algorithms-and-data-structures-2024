package ru.mirea.practice.s23k0362.task6;

public abstract class TesterCircle {
    public static void main(String[] args) {
        Circle qwe = new Circle(3.5, 2.1234567898765432, 10);
        final Circle qaz = new Circle(.9787, 3.4, 12);
        System.out.println(qwe);
        System.out.println("Lenght: " + qwe.getLen());
        System.out.println("Square is " + qwe.getSqure());
        qwe.setr(15);
        System.out.println("Lenght is " + qwe.getLen());
        System.out.println("Comparing 2 circles:\n1: "
                + qaz + "2: " + qwe + "Result - "
                + qaz.compareTwo(qaz, qwe));

    }
}
