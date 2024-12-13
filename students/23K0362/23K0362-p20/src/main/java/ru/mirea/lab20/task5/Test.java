package mirea.lab20.task5;

abstract class Test {
    public static void main(String[] args) {
        Matrix<Double> mat1 = new Matrix<>(2, 2);
        mat1.setValue(0, 0, 3.0);
        mat1.setValue(0, 1, 1.0);
        mat1.setValue(1, 0, -5.0);
        mat1.setValue(1, 1, 4.0);

        Matrix<Double> mat2 = new Matrix<>(2, 2);
        mat2.setValue(0, 0, 2.0);
        mat2.setValue(0, 1, -6.0);
        mat2.setValue(1, 0, 2.0);
        mat2.setValue(1, 1, 1.0);

        Matrix<Double> sumMatrix = mat1.add(mat2);
        System.out.println("Sum:\n" + sumMatrix);
        Matrix<Double> divideMatrix = mat1.divide(mat2);
        System.out.println("Divide:\n" + divideMatrix);
        Matrix<Double> multiplyMatrix = mat1.multiply(mat2);
        System.out.println("Multiply:\n" + multiplyMatrix);
    }
}
