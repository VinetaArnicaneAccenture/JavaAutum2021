package sef.FinalActivity;
/*
Author: Vineta Arnicane
 */

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    // class meant for testing of Calculator class
    // Specification:
    /*
        7) Add tests for calculator
     */

    private Calculator myCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        myCalculator = new Calculator();
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////
    //Tests for class Calculator

    public void testCalculatorSetAndGetType() {
        String testString = "Scientific";
        assertNull(myCalculator.getCalculatorType());
        myCalculator.setCalculatorType(testString);
        assertEquals(testString, myCalculator.getCalculatorType());
    }

    public void testCalculatorParametrizedConstructor() {
        String testString = "Strange";
        Calculator newCalculator = new Calculator(testString);
        assertEquals(testString, newCalculator.getCalculatorType());
    }

    public void testCalculatorSum() {
        int a = 1;
        int b = 5;
        assertEquals(a + b, myCalculator.add(a, b));
        assertEquals(a + b, myCalculator.add(b, a));
    }

    public void testCalculatorSubstract() {
        int a = 1;
        int b = 5;
        assertEquals(b-a, myCalculator.subtract(a, b));
        assertEquals(b - a, myCalculator.subtract(b, a));
        assertEquals(0, myCalculator.subtract(a, a));

        a = 0;
        b = 5;
        assertEquals(b - a, myCalculator.subtract(a, b));
        assertEquals(b - a, myCalculator.subtract(b, a));
        assertEquals(0, myCalculator.subtract(a, a));

        a = -5;
        b = 5;
        assertEquals(b - a, myCalculator.subtract(a, b));
        assertEquals(b - a, myCalculator.subtract(b, a));
        assertEquals(0, myCalculator.subtract(a, a));

        a = -10;
        b = -15;
        assertEquals(a - b, myCalculator.subtract(a, b));
        assertEquals(a-b, myCalculator.subtract(b, a));
    }

    public void testCalculatorMultiply1() {
        int a = 1;
        int b = 2;
        int c = 3;
        int[] num = {a, b, c};

        assertEquals(a * b * c, myCalculator.multiply(num));
    }

    public void testCalculatorMultiply2() {
        int[] num={};
        assertEquals(1, myCalculator.multiply(num));
    }

    public void testCalculatorMultiply3() {
        int a = 2;
        int[] num = {a};
        assertEquals(a, myCalculator.multiply(num));
    }

    public void testCalculatorDivide() {
        int a = 1;
        int b = 5;
        assertEquals(a / b, myCalculator.divide(a, b));

        a = 0;
        b = 5;
        assertEquals(0, myCalculator.divide(a, b));
        assertEquals(0, myCalculator.divide(b, a));
        assertEquals(0, myCalculator.divide(a, a));
    }

}