package ru.mirea.practice.s0000001.task2;

import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
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
        } else {
            Nodes curOne = head;
            while (curOne.next != null) {
                curOne = curOne.next;
            }
            curOne.next = newOne;
            newOne.prev = curOne;
        }
    }

    public void delShape(String a) {
        if (head == null) {
            return;
        }
        if (head.shape.getName().equals(a)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            Nodes curOne = head;
            while (curOne.next != null && !curOne.next.shape.getName().equals(a)) {
                curOne = curOne.next;
            }
            if (curOne != null) {
                if (curOne.next != null) {
                    curOne.next.prev = curOne.prev;
                }
                if (curOne.prev != null) {
                    curOne.prev.next = curOne.next;
                }
            }
        }
    }

    public void printOne(String nam) {
        System.out.println("start :>");
        if (head == null) {
            System.out.println("List is empty!!");
        } else {
            Nodes curOne = head;
            while (!(curOne.shape.getName().equals(nam) || curOne.next == null)) {
                curOne = curOne.next;
            }
            System.out.println(curOne.shape + "\n<: end");
            //if (curOne.prev != null) System.out.println(curOne.prev.shape + "\t<: prevedushii");
        }
    }

    public void clearList() {
        head = null;
    }

    public void printAll() {
        System.out.println("start :>");
        if (head == null) {
            System.out.println("List is empty!!");
        }
        Nodes curOne = head;
        while (curOne != null) {
            curOne.shape.printAtribute();
            curOne = curOne.next;
        }
        System.out.println("<: end");
    }

    public boolean isEmptryList() {
        return head == null;
    }

    public void fileWrite(String s) {
        try (PrintWriter pw = new PrintWriter(s)) {
            Nodes curOne = head;
            while (curOne != null) {
                pw.print(curOne.shape.returnAtribute());
                curOne = curOne.next;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    /*public void fileInsert(String s) {
        try {
            FileInputStream fis = new FileInputStream(s);
            BufferedReader pr = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = pr.readLine()) != null) {
                addShape(new Shape(line,
                        Double.parseDouble(pr.readLine()), Double.parseDouble(pr.readLine())));
            }
            pr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }*/
}
