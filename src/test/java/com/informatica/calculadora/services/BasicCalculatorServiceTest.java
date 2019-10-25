package com.informatica.calculadora.services;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BasicCalculatorServiceTest {
    BasicCalculatorService basicCalculatorService = new BasicCalculatorService();

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void testAdd() throws Exception {
        int result = basicCalculatorService.add(12,43);
        Assert.assertEquals(55, result);
    }

    @Test
    public void testSubstract() throws Exception {
        int result = basicCalculatorService.substract(23, 10);
        Assert.assertEquals(13, result);
    }

    @Test
    public void testSubstractNegative() throws Exception {
        int result = basicCalculatorService.substract(23, 40);
        Assert.assertEquals(-17, result);
    }

    @Test
    public void testMultiply() throws Exception {
        int result = basicCalculatorService.multiply(5, 12);
        Assert.assertEquals(60, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testCreateFail() {
        basicCalculatorService.divide(12, 0);

        thrown.expect(ArithmeticException.class);
    }


//    @Test
    public void testDivide() throws Exception {
        //double result = basicCalculatorService.divide(9, 18);
        //Assert.assertEquals(0.5d, result, 0.0);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme