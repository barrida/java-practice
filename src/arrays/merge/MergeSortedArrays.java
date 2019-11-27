package arrays.merge;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArrays {

	public static int[] mergeSortedArrays(int[] myArray, int[] alicesArray) {
	    int[] mergedArray = Arrays.copyOf(myArray, myArray.length + alicesArray.length);
	    System.out.println(Arrays.toString(mergedArray));
	    
	    System.arraycopy(alicesArray, 0, mergedArray, myArray.length, alicesArray.length);
	    System.out.println(Arrays.toString(alicesArray));
	    System.out.println(Arrays.toString(mergedArray));
	    
	    Arrays.sort(mergedArray);
	    return mergedArray;
	}
	
	@Test
	public void testMergeSortedArrays() {
		int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
		int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
		assertEquals("[1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]", Arrays.toString(MergeSortedArrays.mergeSortedArrays(myArray, alicesArray)));
		//System.out.println(Arrays.toString(MergeSortedArrays.mergeSortedArrays(myArray, alicesArray)));
	}
	
	@Test
	public void testArrayCopy() {
//		int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
//		int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
//		
//		
//		assertEquals("[1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]", Arrays.toString(MergeSortedArrays.mergeSortedArrays(myArray, alicesArray)));
		//System.out.println(Arrays.toString(MergeSortedArrays.mergeSortedArrays(myArray, alicesArray)));
	}

}
