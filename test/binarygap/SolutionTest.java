package binarygap;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class SolutionTest {


	@Test
	public void testSolution() {
		Solution test = new Solution();
		assertEquals(2, test.solution(9));
		assertEquals(2, test.solution(328));
		assertEquals(5, test.solution(1041));
	}

	@Test
	public void testCreateBinaryRepresentation() {
		assertEquals("1", Solution.createBinaryRepresentation(new BigInteger(Integer.toString(1)), new StringBuilder(1)).toString());
		assertEquals("10", Solution.createBinaryRepresentation(new BigInteger(Integer.toString(2)), new StringBuilder(2)).toString());
		assertEquals("11", Solution.createBinaryRepresentation(new BigInteger(Integer.toString(3)), new StringBuilder(3)).toString());
		assertEquals("100", Solution.createBinaryRepresentation(new BigInteger(Integer.toString(4)), new StringBuilder(4)).toString());
		assertEquals("101", Solution.createBinaryRepresentation(new BigInteger(Integer.toString(5)), new StringBuilder(5)).toString());
		assertEquals("110", Solution.createBinaryRepresentation(new BigInteger(Integer.toString(6)), new StringBuilder(6)).toString());
		assertEquals("1000010001", Solution.createBinaryRepresentation(new BigInteger(Integer.toString(529)), new StringBuilder(529)).toString());
		assertEquals("10000010001", Solution.createBinaryRepresentation(new BigInteger(Integer.toString(1041)), new StringBuilder(1041)).toString());
	}
	
	@Test
	public void testGetLongestBinaryGap(){
		assertEquals(3, Solution.getLongestBinaryGap(new StringBuilder("10010001")));
		assertEquals(5, Solution.getLongestBinaryGap(new StringBuilder("10000010001")));
	}
	
	@Test
	public void testSolutionB(){
		assertEquals(2, Solution.solutionB(9));
		assertEquals(2, Solution.solutionB(328));
		assertEquals(5, Solution.solutionB(1041));
	}

}
