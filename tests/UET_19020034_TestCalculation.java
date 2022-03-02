package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class TestCalculation {

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
        Assert.assertEquals(Long.valueOf(12L), calculation.add(7L, 5L));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(Long.valueOf(6L), calculation.multiply(2L, 3L));
        Assert.assertEquals(Long.valueOf(195L), calculation.multiply(195L, 1L));
        Assert.assertEquals(Long.valueOf(0L), calculation.multiply(195L, 0L));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(1L), calculation.subtract(3L, 2L));
        Assert.assertEquals(Long.valueOf(0L), calculation.subtract(3L, 3L));
        Assert.assertEquals(Long.valueOf(195L), calculation.subtract(195L, 0L));
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(2L), calculation.divide(6L, 3L));
        } catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testFindMaximumNumber() {
        Assert.assertEquals(Long.valueOf(3L), calculation.findMaximumNumber(java.util.Arrays.asList(1L, 2L, 3L)));
    }
}
