package arrays.twodimension;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
/*
 *	1 1 1 0 0 0
	0 1 0 0 0 0	
	1 1 1 0 0 0
	0 0 2 4 4 0
	0 0 0 2 0 0
	0 0 1 2 4 0
 * 
 * */
		int result = 0;
		int[][] temp = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int[][] a = new int[temp.length][];
		
		for (int i = 0; i <= (temp.length / 2); i++) {
			
		}
		System.out.println(temp.length);
		String asd = Arrays.copyOfRange(arr[0], 0, 3).toString();

		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[][] arr = new int[6][6];

		int result = hourglassSum(arr);

	}
}
