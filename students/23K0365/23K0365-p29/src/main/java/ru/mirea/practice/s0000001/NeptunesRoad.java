package ru.mirea.practice.s0000001;

public abstract class NeptunesRoad {
    public static void main(String[] args) {
        int[][] testOne = {
            {0, 1, 0, 0, 0},
            {1, 0, 1, 1, 0},
            {0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0}};
        //или по другому:
        //try (Scanner sc = new Scanner(System.in)) {
        //    int len = sc.nextInt();
        //    int[][] tester = new int[len][len];
        //    for (int i = 0; i < len; i++) {
        //        for (int j = 0; j < len; j++) {
        //            tester[i][j] = sc.nextInt();
        //        }
        //    }
        //}
        int cnt = 0;
        for (int i = 0; i < testOne.length; i++) {
            for (int j = i; j < testOne[0].length; j++) {
                if (testOne[i][j] == 1) {
                    cnt += 1;
                }
            }
        }
        System.out.println("test #1 : " + cnt);
        cnt = 0;
        int[][] testTwo = {
                {0, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 1, 1},
                {1, 0, 1, 0}};// answer - 5
        for (int i = 0; i < testTwo.length; i++) {
            for (int j = i; j < testTwo[0].length; j++) {
                if (testTwo[i][j] == 1) {
                    cnt += 1;
                }
            }
        }
        System.out.println("test #2 : " + cnt);
    }
}
