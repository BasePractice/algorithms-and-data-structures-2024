package ru.mirea.practice.s23k0368.prog3;

import java.util.ArrayList;
import java.util.List;

public abstract class PrologPermutations {
    public static boolean position(Node head, int x, Node list) {
        if (head == null) {
            return false;
        }
        if (head.data == x) {
            return true;
        }
        return position(head.next, x, list.next);
    }

    public static void transposition(Node head, List<Integer> list) {
        if (head == null) {
            return;
        }
        transposition(head.next, list);
        list.add(head.data);
    }


    public static void main(String[] args) {
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(3);
        list.next.next.next = new Node(4);

        System.out.println("Позиция элемента 5: " + position(list, 5, list));


        List<Integer> transposedList = new ArrayList<>();
        transposition(list, transposedList);
        System.out.println("Транспонированный список: " + transposedList); // [4,3,2,1]
    }
}
