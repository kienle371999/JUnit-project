package tests;

import java.util.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_19020033_TestCalculation {

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
    public void testMultiply() {
        Assert.assertEquals(Long.valueOf(6L), calculation.multiply(2L, 3L));
    }

    @Test 
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(6L), calculation.subtract(12L, 6L));
    }

    @Test 
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(2L), calculation.divide(12L, 6L));
        }
        catch (Exception e) {
            Assert.assertEquals("", e.getMessage());
        }
    }

    @Test 
    public void testFindMaximumNumber() {
        List<Long> myList = new ArrayList<Long>();

        myList.add(2L);
        myList.add(1L);
        myList.add(2L);
        myList.add(9L);
        myList.add(11L);

        Assert.assertEquals(Long.valueOf(11L), calculation.findMaximumNumber(myList));
    }

    @Test
    public void testDivideBy0() {
        try {
            Assert.assertEquals(Long.valueOf(2L), calculation.divide(6L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }
}
