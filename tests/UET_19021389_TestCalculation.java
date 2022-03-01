package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_19021389_TestCalculation {

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
    public void testAdd2() {
        try {
            Assert.assertEquals(Long.valueOf(2L), calculation.divide(6L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testAdd3() {
        Assert.assertEquals(Long.valueOf(0L), calculation.add(0L, 0L));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(Long.valueOf(0L), calculation.multiply(0L, 3L);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(-2L), calculation.subtract(0L, 2L));
    }

    @Test
    public void testDivide() {
       Assert.assertEquals(Long.valueOf(3L), calculation.divide(9L, 3L));
    }

    @Test
    public void testFindMax() {
        long[] listNum = {-10, 2, 3, 4, 8, 9, 11, 0}
        long result = 11;
        Assert.assertEquals(result, calculation.findMaximumNumber(listNum));
    }
}
