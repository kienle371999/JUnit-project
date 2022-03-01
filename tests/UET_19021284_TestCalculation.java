package tests;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_19021284_TestCalculation {
    private Calculation calculation;

    @Before
    public void setUp() {
        calculation = new Calculation();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testAdd() {
        Assert.assertEquals(Long.valueOf(5L), calculation.add(2L, 3L));
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(2L), calculation.divide(6L, 0L));
            Assert.assertEquals(Long.valueOf(60L), calculation.divide(6L, 10L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(0L), calculation.subtract(3L, 3L));
        Assert.assertEquals(Long.valueOf(Long.MAX_VALUE), calculation.subtract(Long.MAX_VALUE, 0L));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(Long.valueOf(9L), calculation.multiply(3L, 3L));
        Assert.assertEquals(Long.valueOf(0L), calculation.multiply(Long.MAX_VALUE, 0L));
        Assert.assertEquals(Long.valueOf(Long.MIN_VALUE), calculation.multiply(Long.MIN_VALUE, 1L));
    }

    @Test
    public void testMaximun() {
        ArrayList<Long> list = new ArrayList<Long>(Arrays.asList(1L, 5L, 2L, Long.MIN_VALUE));
        long max = calculation.findMaximumNumber(list);
        Assert.assertEquals(5L, max);
    }
}
