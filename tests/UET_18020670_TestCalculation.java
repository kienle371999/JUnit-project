package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_18020670_TestCalculation {

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
        Assert.assertEquals(Long.valueOf(7L), calculation.add(4L, 3L));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(4L), calculation.subtract(6L, 2L));
    }
    
    @Test
    public void testMultiply() {
        Assert.assertEquals(Long.valueOf(6L), calculation.multiply(2L, 3L));
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(5L), calculation.divide(10L,2L));
        } 
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testFindMaximumNumber() {
        Assert.assertEquals(Long.valueOf(5L), calculation.findMaximumNumber(java.util.Arrays.asList(5L, 4L, 3L)));
    }
}