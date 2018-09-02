package binarygap;

import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		Solution test = new Solution();
		test.solution(9);
	}

	public int solution(int N) {
		BigInteger number = new BigInteger(Integer.toString(N));
		StringBuilder binaryRepresentation = Solution.createBinaryRepresentation(number, new StringBuilder(N));
		return getLongestBinaryGap(binaryRepresentation);
	}


	// returns binary representation of given integer
	public static StringBuilder createBinaryRepresentation(BigInteger N, StringBuilder binary) {
		
		BigInteger denominator = new BigInteger("2");
		
		if (N.intValue() == 1) {
			binary.append(1).reverse();
			return binary;
		} else {
			binary.append(N.mod(denominator));
			return createBinaryRepresentation(N.divide(denominator), binary);
		}
	}
	public static int  getLongestBinaryGap(StringBuilder binaryRepresentation){

		int binaryGap = 0;
		int longestBinaryGap = 0;

		for (int i = 1; i < binaryRepresentation.length(); i++) {
			
			if (binaryRepresentation.charAt(i) == '0') {
				++binaryGap;
			}
			if (binaryRepresentation.charAt(i) == '1') {
				
				if (longestBinaryGap < binaryGap) {
					longestBinaryGap = binaryGap;
				} 
				binaryGap=0;
			}
		}

		return longestBinaryGap;

	}
	
	public static int solutionB(int N){
		BigInteger number = new BigInteger(Integer.toString(N));
		BigInteger denominator = new BigInteger("2");
		
		int binaryGap = 0;
		int longestBinaryGap = 0;
	
		while (number.intValue() != 1) {
			number = number.divide(denominator);
			if (number.mod(denominator).intValue() == 0) {
				 binaryGap++;
			} 
			
			if (number.mod(denominator).intValue() == 1){
				if (longestBinaryGap < binaryGap) {
					longestBinaryGap = binaryGap;
					binaryGap = 0;
				} 
			}
		}
		return longestBinaryGap;
	}
}
