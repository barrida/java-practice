package arrays.oldoccurences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author suleyman.yildirim
 *
 */
public class Solution {

	public int solution(int[] A) {

		int solution = 0;
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

	
		// create map from array
		for (int i = 0; i < A.length; i++) {
			if (!map.containsKey(A[i])) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(A[i], list);
			} else {
				ArrayList<Integer> list2 = map.get(A[i]);
				list2.add(i);
				map.put(A[i], list2);
			}
		}

		// find unpaired element
		for (Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
			if ((entry.getValue().size() % 2) == 1) {
				solution = entry.getKey();
				break;
			}
		}

		System.out.println(map.toString());
		System.out.println(solution);
		return solution;

	}

	public static void main(String[] args) {

		int[] A = new int[] { 9, 3, 9, 3, 9, 7, 9 };
		Solution s = new Solution();
		s.solution(A);

	}

}
