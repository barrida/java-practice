package timecomplexity;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogJmpTest {

	@Test
	public void testSolution() {
		FrogJmp frog = new FrogJmp();
		assertEquals(3, frog.solution(10, 85, 30));
		assertEquals(4, frog.solution(20, 37, 5));
		assertEquals(9, frog.solution(1, 10, 1));
		assertEquals(1, frog.solution(1, 2, 1));
		assertEquals(0, frog.solution(1, 1, 1));
	}

}
