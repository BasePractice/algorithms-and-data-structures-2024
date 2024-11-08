package ru.mirea.practice.s0000001.n1;

import java.util.Date;

public final class Fam {
    private Fam() {}

    public static void main(String[] args) {
        String fam = "Самохин";
        Date datPoluch = new Date();

        System.out.println("Разработчик: " + fam);
        System.out.println("Дата и время получения задания: " + datPoluch);

        Date datSdacha = new Date();
        System.out.println("Дата и время сдачи задания: " + datSdacha);
    }
}
