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
        Assert.assertEquals(Long.valueOf(12L), calculation.add(5L, 7L));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(Long.valueOf(35L),calculation.multiply(5L,7L));
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(Long.valueOf(2L),calculation.subtract(7L,5L))
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(3L), calculation.divide(2L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testFindMaximumNumber(){
        Long[] arr = {1L,10L,2L,5L,9L,12L,4L};
        List<Long> list = Arrays.asList(arr);
        Assert.assertEquals(12L,calculation.findMaximumNumber(list));
    }
}
