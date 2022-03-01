package tests;

import java.util.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_19021219_TestCalculation {

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
        Assert.assertEquals(Long.valueOf(0L), calculation.add(3L, -3L));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(Long.valueOf(10L), calculation.multiply(2L, 5L));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(9L), calculation.subtract(9L, 0L));
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(2L), calculation.divide(5L, 2L));
        } catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testFindMaximumNumber() {
        List<Long> arr = new ArrayList<Long>(Arrays.asList(1L));
        Assert.assertEquals(Long.valueOf(1L), calculation.findMaximumNumber(arr));
    }
}
