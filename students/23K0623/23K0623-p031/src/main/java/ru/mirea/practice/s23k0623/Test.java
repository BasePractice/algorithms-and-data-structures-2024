package ru.mirea.practice.s23k0623;

import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {
        final Tree tree = new Tree();
        Processor[] procs = new Processor[3];
        procs[0] = new Processor(1,"a",1.0,1,1.0,1,1);
        procs[1] = new Processor(2,"b",2.0,2,2.0,2,2);
        procs[2] = new Processor(3,"c",3.0,3,3.0,3,3);
        tree.add(procs[0]);
        tree.add(procs[1]);
        tree.add(procs[2]);

        try (Scanner scanner = new Scanner(System.in)) {
            String command;
            while (true) {
                System.out.print("input: ");
                command = scanner.nextLine();
                if ("E".equalsIgnoreCase(command)) {
                    break;
                }
                executeCommand(tree, command);
            }
        }
    }

    private static void executeCommand(Tree tree, String command) {
        switch (command.charAt(0)) {
            case 'L':
                tree.print();
                break;
            case 'D':
                tree.delete(10);
                break;
            case 'A':
                tree.add(new Processor(10,"e",10.0,10,10.0,10,10));
                break;
            case 'S':
                tree.saveToFile("aga");
                break;
            default:
                System.out.println("wrong input.");
                break;
        }
    }
}
