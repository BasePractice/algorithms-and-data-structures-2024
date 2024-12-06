package ru.mirea.practice.s23l0908.task4;

@SuppressWarnings("unused")
public final class CalculatorView {

    private CalculatorView() {
    }

    @SuppressWarnings("unused")
    public static void calculator(double n, CalculatorModel calculatorModel) {
        if ("+".equals(calculatorModel.getOperator())) {
            calculatorModel.setResult(calculatorModel.getResult() + n);
        } else if ("-".equals(calculatorModel.getOperator())) {
            calculatorModel.setResult(calculatorModel.getResult() - n);
        } else if ("*".equals(calculatorModel.getOperator())) {
            calculatorModel.setResult(calculatorModel.getResult() * n);
        } else if ("/".equals(calculatorModel.getOperator())) {
            calculatorModel.setResult(calculatorModel.getResult() / n);
        } else if ("=".equals(calculatorModel.getOperator())) {
            calculatorModel.setResult(n);
        }
        calculatorModel.setResult(Double.parseDouble(calculatorModel.getResult() + ""));
    }

}

