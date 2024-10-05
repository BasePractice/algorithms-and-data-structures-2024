package ru.mirea.practice.s23L0908;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int i=0;int sum=0;
        do
        {
            System.out.print("arr["+i+"] =");
            arr[i]= scanner.nextInt();
            sum+=arr[i];
            i++;
        }while(i<n);
        i=0;
        int min=arr[0],max=arr[0];
        while(i<n){
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            i++;
        }
        System.out.println("Sum="+sum);
        System.out.println("Min="+min);
        System.out.println("Max="+max);
    }
}
