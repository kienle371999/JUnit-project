package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

import java.util.ArrayList;

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
        Assert.assertEquals(java.util.Optional.of(0L), calculation.add(1L, -1L));
        Assert.assertEquals(null, calculation.add(9223372036854775807L, 3L));
    }

    @Test
    public void testForMultiply() {
        Assert.assertEquals(Long.valueOf(31474836470L), calculation.multiply(3147483647L, 10L));
        Assert.assertEquals(Long.valueOf(0L), calculation.multiply(Long.MAX_VALUE, 0L));
        Assert.assertEquals(Long.valueOf(Long.MIN_VALUE), calculation.multiply(Long.MIN_VALUE, 2L));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(0L), calculation.subtract(Long.MAX_VALUE, Long.MAX_VALUE));
        Assert.assertEquals(Long.valueOf(Long.MAX_VALUE), calculation.subtract(Long.MAX_VALUE, Long.MIN_VALUE));
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
        Assert.assertEquals(Long.valueOf(3L), calculation.findMaximumNumber(java.util.Arrays.asList(1L, null, 3L)));
        Assert.assertEquals(null, calculation.findMaximumNumber(new ArrayList<>()));
        Assert.assertEquals(null, calculation.findMaximumNumber(null));
    }
}
