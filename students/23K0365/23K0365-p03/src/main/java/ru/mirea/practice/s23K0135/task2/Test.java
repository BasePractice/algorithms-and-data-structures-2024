package ru.mirea.practice.s23K0135.task2;

public abstract class Test {
    public static void main(String[] args) {

        Point a1 = new Point(21.4325, 6.2748);
        Point a2 = new Point(0.241, 999.9);
        Point a3 = new Point(532.3, 75.435);
        System.out.println(a1);
        System.out.println();

        int len = 3;
        Circle[] ar1 = {new Circle(a1),
            new Circle(a2), new Circle(a3)};
        System.out.println(ar1[0]);
        System.out.println();

        Tester arr = new Tester(ar1, len);

        System.out.println(arr);

        System.out.println("Smallest is: " + arr.findSmaller(arr));
        System.out.println("Bigest is: " + arr.findBigger(arr));

        System.out.println("Sorted by radius: " + arr.sortByRadius(arr));

    }
}
