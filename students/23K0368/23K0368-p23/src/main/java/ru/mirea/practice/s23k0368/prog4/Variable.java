package ru.mirea.practice.s23k0368.prog4;

class Variable implements TripleExpression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        int result;
        switch (name) {
            case "x":
                result = x;
                break;
            case "y":
                result = y;
                break;
            case "z":
                result = z;
                break;
            default:
                throw new IllegalArgumentException("Unknown variable: " + name);
        }
        return result;
    }
}
