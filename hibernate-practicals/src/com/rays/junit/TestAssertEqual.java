
package com.rays.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAssertEqual {

	@Test
	public void testAssertEqual() {

		int max = Calculation.findMax(new int[] { 1, 3, 4, 2, 6 });

		// assertEquals(5, max);
		// assertTrue(6 == max);
		assertTrue("is not true", 5 == max);
	}
}
