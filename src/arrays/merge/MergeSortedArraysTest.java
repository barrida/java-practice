package arrays.merge;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MergeSortedArraysTest {

	@Test
	public void testMergeSortedArrays() {
		int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
		int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
		assertEquals("[1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]", Arrays.toString(MergeSortedArrays.mergeSortedArrays(myArray, alicesArray)));
		System.out.println(Arrays.toString(MergeSortedArrays.mergeSortedArrays(myArray, alicesArray)));
	}

}
