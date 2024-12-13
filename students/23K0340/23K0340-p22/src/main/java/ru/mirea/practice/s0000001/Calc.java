package ru.mirea.practice.s0000001;

public class Calc {
    private Stack stack;
    private int size;

    public Calc(int size) {
        this.size = size;
        this.stack = new Stack(size);
    }

    public int getSize() {
        return size;
    }

    public void iter(String data) {
        if (isStringDouble(data)) {
            this.stack.push(Double.parseDouble(data));
        } else {
            if ("*".equals(data)) {
                this.stack.push(this.stack.pop() * this.stack.pop());
            } else if ("/".equals(data)) {
                this.stack.push(Math.pow(this.stack.pop(), -1) * this.stack.pop());
            } else if ("+".equals(data)) {
                this.stack.push(this.stack.pop() + this.stack.pop());
            } else if ("-".equals(data)) {
                this.stack.push(this.stack.pop() * (-1) + this.stack.pop());
            } else {
                System.out.println("Incorrect input");
            }
        }
    }

    public boolean isStringDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public double end() {
        return this.stack.pop();
    }
}
