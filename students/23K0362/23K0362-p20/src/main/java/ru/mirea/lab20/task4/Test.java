package mirea.lab20.task4;

abstract class Test {
    public static void main(String[] args) {
        String[] strMass = {"Dof", "", "jkdsjkjds"};
        Integer[] integerMass = {1, 2345, 34567, -87654, 0, 43};
        FindMaxMin<String> findMxMnStr = new FindMaxMin<>(strMass);
        System.out.println("Max value > \"" + findMxMnStr.findMax() + "\", min value > \"" + findMxMnStr.findMin() + "\"");
        FindMaxMin<Integer> findMxMnInt = new FindMaxMin<>(integerMass);
        System.out.println("Max value > " + findMxMnInt.findMax() + ", min value > " + findMxMnInt.findMin());
        /*
        Max value > "jkdsjkjds", min value > ""
        Max value > 34567, min value > -87654
         */
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.sum(23456.3454, 234));
        System.out.println("Multiply: " + calc.multiply(6.3454, -3456));
        System.out.println("Divide: " + calc.divide(2354, -45.345));
        System.out.println("Subtraction: " + calc.substraction(236.3454, 0));
        System.out.println("Subtraction: " + calc.substraction(236.3454, 54));
        /*
        Sum: 23690.3454
        Multiply: -21929.7024
        Divide: 2399.345
        Must be not 0 values in denominator.
        Subtraction: 0.0
        Subtraction: 4.376766666666667
         */
    }
}
