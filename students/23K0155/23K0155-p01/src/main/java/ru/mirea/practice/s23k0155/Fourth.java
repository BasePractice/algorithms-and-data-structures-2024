package ru.mirea.practice.s23k0155;

public class Fourth {
    public static void main(String[] args){
        float t;
        for(int i=1; i<11; i++){
            t = 1/(float)i;
            //System.out.println("Number " + i + ": " + t);
            System.out.printf("Number %d: %.3f\n", i, t);
        }
    }
}
