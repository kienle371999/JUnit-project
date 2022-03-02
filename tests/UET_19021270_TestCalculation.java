package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_19021270_TestCalculation {

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
        Assert.assertEquals(java.util.Optional.of(Long.MAX_VALUE), calculation.add(9223372036854775807L, 3L));
    }

    @Test
    public void testForMultiply() {
        Assert.assertEquals(Long.valueOf(9L), calculation.multiply(3L, 3L));
        Assert.assertEquals(Long.valueOf(0L), calculation.multiply(Long.MAX_VALUE, 0L));
        Assert.assertEquals(Long.valueOf(Long.MIN_VALUE), calculation.multiply(Long.MIN_VALUE, 1L));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(1L), calculation.subtract(3L, 2L));
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
