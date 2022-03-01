package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_19021268_TestCalculation {

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
        Assert.assertEquals(Long.valueOf(100L), calculation.add(50L, 50L));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(Long.valueOf(45L), calculation.multiply(15L, 3L));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(0L), calculation.subtract(10L, 10L));
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(5L), calculation.divide(15L, 3L));
        } catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testFindMaximumNumber() {
        Assert.assertEquals(Long.valueOf(1249L), calculation.findMaximumNumber(java.util.Arrays.asList(0L, 1249L, 3L, 124L, 123)));
    }
}