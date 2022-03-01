package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_18020231_TestCalculation {

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
        Assert.assertEquals(Long.valueOf(11L), calculation.add(6L, 5L));
    }
    @Test
    public void testMultiply(){
        Assert.assertEquals(Long.valueOf(30L),calculation.multiply(6L,5L));
        Assert.assertEquals(Long.valueOf(0L),calculation.multiply(6L,0L));
    }
    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(1L), calculation.subtract(6L, 5L));
    }
    @Test
    public void testDivide() {
        Assert.assertEquals(Long.valueOf(2L), calculation.divide(6L, 3L));
        try {
            Assert.assertEquals(Long.valueOf(2L), calculation.divide(6L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }
    @Test
    public void testFindMaximumNumber() {
        Assert.assertEquals(Long.valueOf(6L), calculation.findMaximumNumber(java.util.Arrays.asList(3L, 6L, 5L)));
    }
}
