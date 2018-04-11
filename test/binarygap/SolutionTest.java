package binarygap;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testSolution() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateBinaryRepresentation() {
		
		assertEquals("1", Solution.createBinaryRepresentation(1, new StringBuilder(1)).toString());
		assertEquals("10", Solution.createBinaryRepresentation(2, new StringBuilder(2)).toString());
		assertEquals("11", Solution.createBinaryRepresentation(3, new StringBuilder(3)).toString());
		assertEquals("100", Solution.createBinaryRepresentation(4, new StringBuilder(4)).toString());
		assertEquals("101", Solution.createBinaryRepresentation(5, new StringBuilder(5)).toString());
		assertEquals("110", Solution.createBinaryRepresentation(6, new StringBuilder(6)).toString());
		assertEquals("1000010001", Solution.createBinaryRepresentation(529, new StringBuilder(529)).toString());
		assertEquals("10000010001", Solution.createBinaryRepresentation(1041, new StringBuilder(1041)).toString());
	}
	
	@Test
	public void testGetLongestBinaryGap(){
		assertEquals(3, Solution.getLongestBinaryGap(new StringBuilder("10010001")));
		assertEquals(5, Solution.getLongestBinaryGap(new StringBuilder("10000010001")));
	}
	
	@Test
	public void testSolutionB(){
		assertEquals(2, Solution.solutionB(9));
		assertEquals(5, Solution.solutionB(1041));
	}

}
