package tests;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_18020831_TestCalculation {

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
        Assert.assertEquals(Long.valueOf(12L), calculation.add(4L, 8L));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(Long.valueOf(40L),calculation.multiply(5L,8L));
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(Long.valueOf(1L),calculation.subtract(8L,7L))
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(2L), calculation.divide(2L, 1L));
            Assert.assertEquals(Long.valueOf(9L), calculation.divide(9L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testFindMaximumNumber(){
        Long[] arr = {9L,15L,2L,8L,5L,1L,10L};
        List<Long> list = Arrays.asList(arr);
        Assert.assertEquals(15L,calculation.findMaximumNumber(list));
    }
}