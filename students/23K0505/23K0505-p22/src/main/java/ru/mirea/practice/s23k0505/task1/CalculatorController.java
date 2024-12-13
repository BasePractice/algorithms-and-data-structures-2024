package ru.mirea.practice.s23k0505.task1;

import ru.mirea.practice.s23k0505.task1.utilclasses.Number;
import ru.mirea.practice.s23k0505.task1.utilclasses.Operation;
import ru.mirea.practice.s23k0505.task1.utilclasses.OperationType;

import java.util.LinkedList;
import java.util.List;

public class CalculatorController {
    private final Calculator calculator;
    private final List<ComputingElement> fakeStack;
    private int numbersCount;
    private int operationCount;

    public CalculatorController() {
        this.calculator = new Calculator();
        fakeStack = new LinkedList<>();
        numbersCount = 0;
        operationCount = 0;
    }

    public void addNumber(double number) {
        fakeStack.add(new Number(number));
        numbersCount += 1;
    }

    public void addOperation(OperationType operationType) {
        if (operationCount < numbersCount - 1) {
            fakeStack.add(new Operation(operationType));
            operationCount += 1;
        }
    }

    public void clear() {
        fakeStack.clear();
    }

    public ComputingElement delete() {
        ComputingElement element = null;
        if (!fakeStack.isEmpty()) {
            element = fakeStack.remove(fakeStack.size() - 1);
            if (element instanceof Number) {
                numbersCount -= 1;
            } else {
                operationCount -= 1;
            }
        }
        return element;
    }

    public double compute() {
        toRealStack();
        fakeStack.clear();
        final Number result = calculator.compute();
        fakeStack.addAll(calculator.getStack());
        calculator.clear();
        numbersCount -= operationCount + 1;
        operationCount = 0;
        return result.getValue();
    }

    public int getStackSize() {
        return fakeStack.size();
    }

    private void toRealStack() {
        for (ComputingElement element : fakeStack) {
            if (element instanceof Number) {
                calculator.addNumber((Number) element);
            } else if (element instanceof Operation) {
                calculator.addOperation((Operation) element);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder fakeStackStr = new StringBuilder();
        for (ComputingElement element : fakeStack) {
            fakeStackStr.append(element.toString());
            fakeStackStr.append(" ");
        }
        return fakeStackStr.toString();
    }

    public String printStack() {
        return String.format("Numbers: %d, Operations: %d", numbersCount, operationCount);
    }
}
