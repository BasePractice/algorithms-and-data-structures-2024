package mirea.lab9.task5;

public class String1 implements StringOperations {

    @Override
    public int lenString(String s) {
        return s.length();
    }

    @Override
    public String makeStringOddPositions(String inpString) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < inpString.length(); i += 2) {
            result.append(inpString.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String invertString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
