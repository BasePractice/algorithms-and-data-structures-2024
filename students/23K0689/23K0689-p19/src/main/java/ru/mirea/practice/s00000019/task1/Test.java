package ru.mirea.practice.s0000001.task1;

public abstract class Test {
    public static void main(String[] args) {
        User u1 = new User("1234567890","a1","legal");
        User u2 = new User("123456789","a2","legal");
        User u3 = new User("123456789012","a3","physical");
        User u4 = new User("12345678901","a3","physical");
        User u5 = new User("1234567890","a3","physical");
        Innchecker check = new Innchecker();
        check.validator(u1);
        check.validator(u2);
        check.validator(u3);
        check.validator(u4);
        check.validator(u5);
    }
}
