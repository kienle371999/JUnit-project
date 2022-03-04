package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_18020523_TestCalculation {

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
        Assert.assertEquals(Long.valueOf(1L), calculation.add(1L, 0L));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(Long.valueOf(Long.MIN_VALUE), calculation.multiply(Long.MIN_VALUE, 1L));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(Long.MAX_VALUE), calculation.subtract(Long.MAX_VALUE, 0L));
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(0L), calculation.divide(1L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testFindMaximumNumber() {
        Assert.assertEquals(Long.valueOf(0L), calculation.findMaximumNumber(java.util.Arrays.asList(0L, 0L, 0L)));
    }
}
