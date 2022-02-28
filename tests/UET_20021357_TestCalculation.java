package tests;

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
        Assert.assertEquals(Long.valueOf(100L), calculation.add(90L, 10L));
    }

    @Test
    public void testDivide1() {
        try {
            Assert.assertEquals(Long.valueOf(3200L), calculation.divide(6400L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testDivide2(){
        try {
            Assert.assertEquals(Long.valueOf(3200L), calculation.divide(6400L, 2L));
        }
        catch (Exception e){
            Assert.assertEquals("Can not be invalid!", e.getMessage());
        }
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(Long.valueOf(90000L), calculation.subtract(100000L, 10000L));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(Long.valueOf(1000000000L), calculation.multiply(1000000L, 100000L));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(Long.valueOf(0L), calculation.multiply(Long.MAX_VALUE, 0L));
    }

    @Test
    public void testFindMaximumNumber(){
        ArrayList<Long> numbers = new ArrayList<Long>(Arrays.asList(123L, 255L, 3241L, 456L, 50L, Long.MAX_VALUE));
        long max = calculation.findMaximumNumber(numbers);
        Assert.assertEquals(Long.MAX_VALUE, max);
}