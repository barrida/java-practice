package timecomplexity;

import static org.junit.Assert.*;

import org.junit.Test;

import timecomplexity.TapeEquilibrium;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	@Test
	public void testSolution() {
		TapeEquilibrium s = new TapeEquilibrium();
		int[] A = new int[] {3,1,2,4,3};
		assertEquals(1, s.solution(A));
	}

}
