package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

public class UET_19021320_TestCalculation {

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
        Assert.assertEquals(Long.valueOf(1L), calculation.multiply(Long.MAX_VALUE(), Long.MAX_VALUE()));
    }

    @Test
    public void testAdd4() {
        Assert.assertEquals(Long.valueOf(0L), calculation.divide(1L, 5L));

    }

    @Test
    public void testAdd5() {
        Assert.assertEquals(Long.valueOf(-2L), calculation.add(Long.MAX_VALUE(), Long.MAX_VALUE()));
    }

    @Test
    public void testAdd6() {
        Assert.assertEquals(Long.valueOf(-1l), calculation.subtract(Long.MAX_VALUE(), Long.MIN_VALUE()));
    }

    @Test
    public void testAdd7() {
        Assert.assertEquals(Long.valueOf(10), new Long[]{3, 5, 7, 9, 10, 10});
    }
}
