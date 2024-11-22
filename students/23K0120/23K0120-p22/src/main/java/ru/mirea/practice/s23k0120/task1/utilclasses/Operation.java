package ru.mirea.practice.s23k0120.task1.utilclasses;

import ru.mirea.practice.s23k0120.task1.ComputingElement;

public class Operation implements ComputingElement {

    private final OperationType operation;

    public Operation(OperationType operation) {
        this.operation = operation;
    }

    public OperationType getOperation() {
        return operation;
    }

    public Number compute(Number numA, Number numB) {
        double result = 0;
        double a = numA.getValue();
        double b = numB.getValue();
        switch (operation) {
            case ADD:
                result = a + b;
                break;
            case SUBTRACT:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                result = a / b;
                break;
            default:
                break;
        }
        return new Number(result);
    }

    @Override
    public String toString() {
        String strOp = "";
        switch (operation) {
            case ADD:
                strOp = "+";
                break;
            case SUBTRACT:
                strOp = "-";
                break;
            case MULTIPLY:
                strOp = "*";
                break;
            case DIVIDE:
                strOp = "/";
                break;
            default:
                break;
        }
        return strOp;
    }
}
