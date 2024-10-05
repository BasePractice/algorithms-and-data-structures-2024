package ru.mirea.practice.s23L0908.Task1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        double r;
        Circle k1= new Circle();
        System.out.println("Do dai duong tron ="+ k1.getPerimetr()+"cm");
        Scanner source = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r= source.nextDouble();
        k1.setR(r);
        System.out.println("\n Do dai duong tron= "+k1.getPerimetr()+ "cm");
    }
}
