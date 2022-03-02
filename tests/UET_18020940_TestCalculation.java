package tests;

import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import programs.Calculation;

public class UET_18020940_TestCalculation {
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
		Assert.assertEquals(Long.valueOf(0L), calculation.add(-1L, 1L));;
	}
	
	@Test
	public void testSubstract() {
		Assert.assertEquals(calculation.subtract(2L, 2L), calculation.subtract(-2L, -2L));
	}
	
	@Test
	public void testMultiply() {
		Assert.assertEquals(Long.valueOf(0L), calculation.multiply(2l, 0L));
	}
	
	@Test
	public void testDivide() {
		try {
			Assert.assertEquals(Long.valueOf(0L), calculation.divide(0L, 1L));
		} catch (Exception e) {
			Assert.assertEquals("Invalid Division", e.getMessage());
		}
	}
	
	@Test
	public void testFindMaximumNumber() {
		List<Long> arr = new ArrayList<Long>(Arrays.asList(-1L, 0L, 1L));
		Assert.assertEquals(Long.valueOf(1L), calculation.findMaximumNumber(arr));
	}
}
