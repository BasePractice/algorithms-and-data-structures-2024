package ru.mirea.practice.s23K0135.task5;

public abstract class TesterMove {
    public static void main(String[] args) {
        MovableCircle cir = new MovableCircle(235.7, 326.6, 56);
        MovablePoint poi = new MovablePoint(326.1, 734.2);
        Movable[] a = {cir, poi};
        cir.moving(8923,-124);
        System.out.println(a[1].toString() + "\n" + a[0].toString());
    }
}
