package ru.mirea.practice.s0000001.task2;

public abstract class Rerereveses {
    public static void main(String[] args) {
        String[] arrStart = {"Группа", "Крови", "на", "рукове", "порядковый", "Номер", "на", "рукове", "Пожелай", "мне", "удачи", "в", "бою"};
        System.out.println("START:");
        for (String i : arrStart) {
            System.out.print(i + " ");
        }
        System.out.println("\n ");

        int levo = 0;
        int pravo = arrStart.length - 1;

        while (levo < pravo) {
            String j = arrStart[levo];
            arrStart[levo] = arrStart[pravo];
            arrStart[pravo] = j;
            levo++;
            pravo--;
        }
        System.out.println("FINISH:");
        for (String i : arrStart) {
            System.out.print(i + " ");
        }

    }
}
