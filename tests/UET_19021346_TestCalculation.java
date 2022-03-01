package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_19021346_TestCalculation {
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
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(1L), calculation.subtract(4L, 3L));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(Long.valueOf(12L), calculation.multiply(4L, 3L));
    }


    @Test
    public void testFindMaximumNumber() {
        ArrayList<Long> arr = new ArrayList<Long>(Arrays.asList(1L, 5L, 2L, 10L));
        Assert.assertEquals(Long.valueOf(10L), calculation.findMaximumNumber(arr);
    }
}
