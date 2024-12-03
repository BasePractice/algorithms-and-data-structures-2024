package ru.mirea.practice.s0000001.task3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ListOfShapes {
    private Nodes head;

    public ListOfShapes() {
        this.head = null;
    }

    public void addShape(Shape a) {
        Nodes newOne = new Nodes(a);
        if (head == null) {
            head = newOne;
            head.next = head;
        } else {
            Nodes curOne = head;
            while (curOne.next != head) {
                curOne = curOne.next;
            }
            curOne.next = newOne;
            newOne.next = head;
        }
    }

    // Метод удаления элемента по имени
    public void delShape(String name) {
        if (head == null) {
            return;
        }
        if (head.shape.getName().equals(name)) {
            if (head.next == head) {
                head = null;
            } else {
                Nodes curOne = head;
                while (curOne.next != head) {
                    curOne = curOne.next;
                }
                head = head.next;
                curOne.next = head;
            }
        } else {
            Nodes curOne = head;
            while (curOne.next != head && !curOne.next.shape.getName().equals(name)) {
                curOne = curOne.next;
            }
            if (curOne.next != head) {
                curOne.next = curOne.next.next;
            }
        }
    }

    public void printOne(String name) {
        System.out.println("start :>");
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        Nodes curOne = head;
        do {
            if (curOne.shape.getName().equals(name)) {
                System.out.println(curOne.shape + "\n<: end");
                return;
            }
            curOne = curOne.next;
        } while (curOne != head);
        System.out.println("Element not found!");
    }

    public void clearList() {
        head = null;
    }

    public void printAll() {
        System.out.println("start :>");
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        Nodes curOne = head;
        do {
            curOne.shape.printAtribute();
            curOne = curOne.next;
        } while (curOne != head);
        System.out.println("<: end");
    }

    public boolean isEmptyList() {
        return head == null;
    }

    public void fileWrite(String s) {
        try {
            FileOutputStream fos = new FileOutputStream(s);
            try (PrintWriter pw = new PrintWriter(fos)) {
                Nodes curOne = head;
                if (head != null) {
                    do {
                        pw.print(curOne.shape.returnAtribute());
                        curOne = curOne.next;
                    } while (curOne != head);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
