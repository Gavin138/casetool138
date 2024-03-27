package casetoolsAssignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Program3Test {

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
	public void testFibonnaciSeries() {
		// Test case when n = 0
		try {
			Program3.printFib(0);
		} catch (IllegalArgumentException e) {
			assertEquals("Number of terms should be greater than zero", e.getMessage());
		}
		
		// Test case when n = 5
		try {
			Program3.printFib(5);
		} catch (IllegalArgumentException e) {
			assertEquals("1, 2, 3", e.getMessage());
		}
		
		// Test case when n = 10
		try {
			Program3.printFib(10);
		} catch (IllegalArgumentException e) {
			assertEquals("1, 2, 3, 5, 8, 13, 21, 34", e.getMessage());
		}
	}

}
