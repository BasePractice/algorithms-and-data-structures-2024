package ru.mirea.practice.s0000001.pw41.task2;

public class TestPhone {
    public static void main(String[] args) {
        Phone a = new Phone();
        Phone b = new Phone(8987345,"Iphone");
        System.out.println("Phone num: "+b.getNumber());
        Phone c = new Phone(89871234,"Xiomi",999);

        a.recieveCall("Vanya");
        b.recieveCall("Vanya",1234);

        System.out.println();

        int[] arr= {1,12,123,1234,12345,123456,11234567,12345678,123456789};
        c.sendMessage(arr);
    }
}
