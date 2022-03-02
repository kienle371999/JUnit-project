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
        Assert.assertEquals(6, calculation.add(5, 1));
    }

    @Test
    public void testSubstract() {
        Assert.assertEquals(6, calculation.subtract(10, 4));
    }                    

    @Test 
    public void testMultiply() {
        Assert.assertEquals(6, calculation.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(5, calculation.divide(32, 0));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testFindmax() {
        List<Long> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(24);
        numbers.add(19);
        numbers.add(84);

        Assert.assertEquals(84, calculation.findMaximumNumber(numbers));
    }
}