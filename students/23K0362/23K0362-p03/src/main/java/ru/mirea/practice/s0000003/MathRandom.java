package ru.mirea.practice.s0000003;

import java.util.Arrays;
import java.util.Random;

abstract class MathRandom {
    public static void main(String[] args) {
        Random rnd = new Random();
        int lenArr = 5;
        double[] arrValRand = new double[lenArr];
        double[] arrValMath = new double[lenArr];

        for (int i = 0; i < lenArr; i++) {
            arrValMath[i] = Math.random();
            arrValRand[i] = rnd.nextDouble();
        }
        StringBuilder strArrRand =  new StringBuilder();
        StringBuilder strArrMath = new StringBuilder();
        for (int i = 0; i < lenArr; i++) {
            strArrRand.append(arrValRand[i]).append(" ");
            strArrMath.append(arrValMath[i]).append(" ");
        }
        System.out.println("Неотсортированные списки >\nСгенерированный с помощью Rand > " + strArrRand);
        System.out.println("Сгенерированный с помощью Math > " + strArrMath);
        Arrays.sort(arrValMath);
        Arrays.sort(arrValRand);
        strArrRand =  new StringBuilder();
        strArrMath = new StringBuilder();
        for (int i = 0; i < lenArr; i++) {
            strArrRand.append(arrValRand[i]).append(" ");
            strArrMath.append(arrValMath[i]).append(" ");
        }
        System.out.println("Неотсортированные списки >\nСгенерированный с помощью Rand > " + strArrRand);
        System.out.println("Сгенерированный с помощью Math > " + strArrMath);
    }
}
