package ru.mirea.practice.s230k754.lab11.task1;

class HaffmanN {
    // Character data
    char data;

    // Frequency of the character
    int frequency;

    // Left and right child nodes
    HaffmanN left;
    HaffmanN right;

    // Constructor to initialize the node
    HaffmanN(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = right = null;
    }
}
