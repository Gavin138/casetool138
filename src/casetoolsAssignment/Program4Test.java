package casetoolsAssignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Program4Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCountDigitsForZero() {
		int result = Program4.countDigit(0);
		assertEquals(0, result);
	}

	@Test
	public void testCountDigitsForPositiveNumber() {
		int result = Program4.countDigit(12345);
		assertEquals(5, result);
	}
	
	@Test
	public void testCountDigitsForNegativeNumber() {
		int result = Program4.countDigit(-987);
		assertEquals(3, result);
	}
	
}
