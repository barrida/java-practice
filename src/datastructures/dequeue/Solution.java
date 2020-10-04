package datastructures.dequeue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = 6; // total number of integers
		int m = 3; // size of the subarray
		Deque<Integer> deque = new ArrayDeque<Integer>();

		//deque.addAll(Arrays.asList(5, 3, 5, 2, 3, 2));
		
		Set<Integer> uniqueNums = new HashSet<>(); 
		// System.out.println(deque.toString());

		deque.offerLast(2);
		deque.offerLast(3);
		deque.offerLast(4);		
		
		deque.pollFirst();
		
		System.out.println("osman: " + deque.toString());
//		deque.iterator().forEachRemaining(System.out::println);
		
//		for (int i = 0; i < deque.size(); i++) {
//
//			
//			int value = deque.poll();
//			//System.out.println(value);
//			//calculateUniqueNums();
//
//		}
		
		//deque.iterator().forEachRemaining(System.out::println);
	}

}
