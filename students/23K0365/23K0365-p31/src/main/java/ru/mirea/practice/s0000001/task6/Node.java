package ru.mirea.practice.s0000001.task6;

public class Node {
    int data;
    Node[] childs;
    int childCnt;

    Node(int data) {
        this.data = data;
        this.childs = new Node[3];
        this.childCnt = 0;
    }

    void addChild(Node child) {
        if (childCnt < 3) {
            childs[childCnt++] = child;
        }
    }
}
