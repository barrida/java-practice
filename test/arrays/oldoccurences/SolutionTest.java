package arrays.oldoccurences;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {


		int[] A = new int[] { 9, 3, 9, 3, 9, 7, 9 };
		Solution s = new Solution();
		assertEquals(7, s.solution(A));
	}

}
