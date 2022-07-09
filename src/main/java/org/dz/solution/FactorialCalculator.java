package org.dz.solution;

public class FactorialCalculator {
    public int calculate(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number can't be negative");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
