package tests;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;


public class UET_18020455_TestCalculation {

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
        Assert.assertEquals(Long.valueOf(10L), calculation.add(7L, 3L));
    }

    @Test
    public void testDivide1() {
        try {
            Assert.assertEquals(Long.valueOf(2L), calculation.divide(10L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }
    @Test
    public void testDivide2(){
        try {
            Assert.assertEquals(Long.valueOf(8L), calculation.divide(16L, 2L));
        }
        catch (Exception e){
            Assert.assertEquals("Can not be invalid!", e.getMessage());
        }
    }
    @Test
    public void testSubtract(){
        Assert.assertEquals(Long.valueOf(9L), calculation.subtract(10L, 1L));
    }
    @Test
    public void testMultiply(){
        Assert.assertEquals(Long.valueOf(0L), calculation.multiply(Long.MAX_VALUE, 0L));
    }
    @Test
    public void testFindMaximumNumber(){
        ArrayList<Long> numbers = new ArrayList<Long>(Arrays.asList(1L, 2L, 3L, 4L, 5L, Long.MAX_VALUE));
        long max = calculation.findMaximumNumber(numbers);
        Assert.assertEquals(Long.MAX_VALUE, max);
    }
}
