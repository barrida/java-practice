/**
 * 
 */
package arrays.cyclicrotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  A = [3, 8, 9, 7, 6]
 * @author suleyman.yildirim
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		int[] result = Solution.solution(A, K);
		System.out.println(result.toString());
	}
	
	 public static int[] solution(int[] A, int K){
		 List<Integer> intList = createArrayList(A);
		 int[] arr = rotateArrayList(K, intList);
		 return arr;
	 }

	/**
	 * @param K
	 * @param intList
	 * @return
	 */
	private static int[] rotateArrayList(int K, List<Integer> intList) {
		for (int i = 0; i < K; i++) {
			 intList.add(0, intList.get(intList.size()-1).intValue());
			 intList.remove(intList.size()-1);
		 }
		 
		return intList.stream().mapToInt(i -> i).toArray();
	}

	/**
	 * @param A
	 * @return
	 */
	private static List<Integer> createArrayList(int[] A) {
		List<Integer> intList = new ArrayList<Integer>();
		 for (int i : A)
		 {
		     intList.add(i);
		 }
		return intList;
	}

}
