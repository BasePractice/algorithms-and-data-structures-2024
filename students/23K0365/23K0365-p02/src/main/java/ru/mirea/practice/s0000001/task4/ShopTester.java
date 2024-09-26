package ru.mirea.practice.s0000001.task4;
import java.util.Scanner;
public class ShopTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ln;
        System.out.println("How many computers do u wanna add:");
        ln=sc.nextInt();
        Shop[] qw = new Shop[ln];

        for(int i=0;i<ln;i++){
            System.out.println("Enter: Brand, CPU, Price, GPU");
            qw[i]=new Shop(sc.next(),sc.next(),sc.nextInt(),sc.next());
        }

        System.out.println(qw[ln-1]+"\n---\n");

        //System.out.println("Enter min price and max price:");
        for(int i =0;i<qw.length;i++){
            qw[i].findExactByPrice(10,0);
            }

        int delNum=1;
        for(int i =0;i<qw.length;i++){
            qw[i].delComp(qw,(delNum-1) );
            System.out.println(qw[i]);
        }

    }}
