import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CalculationTest {

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
        Assert.assertEquals(Long.valueOf(10L), calculation.add(5L, 5L));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(-2L), calculation.subtract(5L,7L));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(Long.valueOf(100L), calculation.multiply(10L,10L));
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(3),calculation.divide(7L,0L));
        } catch (Exception e) {
            Assert.assertEquals("Invalid Division",e.getMessage());
        }
    }

    @Test
    public void testFindMaximumNumber() {
        List<Long> newList = Arrays.asList(4L,5L,10L,-2L,0L,19L);
        Assert.assertEquals(Long.valueOf(19L),calculation.findMaximumNumber(newList));
    }
}