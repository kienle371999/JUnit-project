package tests;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;


public class UET_20021357_TestCalculation {

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
        Assert.assertEquals(Long.valueOf(100000L), calculation.add(90000L, 10000L));
    }

    @Test
    public void testDivide1() {
        try {
            Assert.assertEquals(Long.valueOf(200L), calculation.divide(10000L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testDivide2(){
        try {
            Assert.assertEquals(Long.valueOf(200L), calculation.divide(1000L, 5L));
        }
        catch (Exception e){
            Assert.assertEquals("Can not be invalid!", e.getMessage());
        }
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(Long.valueOf(900000L), calculation.subtract(1000000L, 100000L));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(Long.valueOf(0L), calculation.multiply(Long.MAX_VALUE, 0L));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(Long.valueOf(0L), calculation.multiply(Long.MIN_VALUE, 0L));
    }

    @Test
    public void testFindMaximumNumber(){
        ArrayList<Long> numbers = new ArrayList<Long>(Arrays.asList(1000L, 200L, 3L, 400000000L, 56L, Long.MAX_VALUE));
        long max = calculation.findMaximumNumber(numbers);
        Assert.assertEquals(Long.MAX_VALUE, max);
    }
}