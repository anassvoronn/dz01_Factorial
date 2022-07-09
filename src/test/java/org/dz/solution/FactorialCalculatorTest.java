package org.dz.solution;

import org.junit.Assert;
import org.junit.Test;


public class FactorialCalculatorTest {

    @Test
    public void calculateFactorialOf1() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculate(1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void calculateFactorialOf2() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculate(2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void calculateFactorialOf3() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculate(3);
        Assert.assertEquals(6, result);
    }

    @Test
    public void calculateFactorialOf10() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculate(10);
        Assert.assertEquals(3628800, result);
    }

    @Test
    public void calculateFactorialOf12() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculate(12);
        Assert.assertEquals(479001600, result);
    }

    @Test
    public void calculateFactorialOf0() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculate(0);
        Assert.assertEquals(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateFactorialOfMinus1() {
        FactorialCalculator calculator = new FactorialCalculator();
        calculator.calculate(-1);
    }
}
