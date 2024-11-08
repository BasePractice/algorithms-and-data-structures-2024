package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;


public abstract class InnCheck {
    public static boolean checkIn(String[] arr, String a) {
        for (String x : arr) {
            if (x.equals(a)) {
                System.out.println("Correct name and INN");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] innList = {
            "11.112.345",
            "24.153.000",
            "52.512.430",
            "01.002.003",
            "14.631.435"
        };
        try (Scanner sc = new Scanner(System.in)) {
            //String clientName = sc.nextLine();
            String clientInn = "01.002.004";//sc.nextLine();
            try {
                if (!checkIn(innList, clientInn)) {
                    throw new BadInnExtencionExceprion("Wrong INN: " + clientInn);
                }
            } catch (BadInnExtencionExceprion e) {
                System.out.println("WRONG INN: " + clientInn);
            }
        }
    }
}
