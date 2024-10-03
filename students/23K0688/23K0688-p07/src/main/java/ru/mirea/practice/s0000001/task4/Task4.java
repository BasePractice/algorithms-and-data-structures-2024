package ru.mirea.practice.s0000001.task4;

public abstract class Task4 {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        double pi = mc1.PI;
        System.out.println("PI=" + pi);
        double deist = 3;
        double mnim = -2;
        double mod = mc1.compabs(mnim,deist);
        double f = Math.atan(mnim / deist);
        f = Math.toDegrees(f);
        String f0 = String.format("%.0f", f);
        String mod0 = String.format("%.0f", mod);
        double n = 2;
        System.out.println("Z в алгебр. форме = " + deist + mnim + "i");
        System.out.println("Z в тригоном. форме = " + mod0 + "(cos(" + f0 + "°)+isin(" + f0 + "°))");
        mod = mc1.compow(n,mod,f)[0];
        mod0 = String.format("%.0f",mod);
        f = mc1.compow(n,mod,f)[1];
        f0 = String.format("%.0f", f);
        System.out.println("Z^" + n + " в тригоном. форме = " + mod0 + "(cos(" + f0 + "°)+isin(" + f0 + "°))");
        System.out.println(Math.cos(Math.toRadians(60)));
    }
}
