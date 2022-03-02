package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class TestCalculation {

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
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(4L), calculation.subtract(6L, 2L));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(Long.valueOf(8L), calculation.multiply(2L, 4L));
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(30L), calculation.divide(1000L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testFindMaximumNumber(){
        ArrayList<Long> testlist = new ArrayList<Long>(Arrays.asList(1L, 3L, 7L, 4L, 9L));
        long max = calculation.findMaximumNumber(testlist);
        Assert.assertEquals(9L, max);
    }

}
