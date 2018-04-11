package binarygap;

public class Solution {

	public static void main(String[] args) {
		Solution test = new Solution();
		test.solution(9);
	}

	public int solution(int N) {
		StringBuilder binaryRepresentation = Solution.createBinaryRepresentation(N, new StringBuilder(N));
		return getLongestBinaryGap(binaryRepresentation);
	}


	// returns binary representation of given integer
	public static StringBuilder createBinaryRepresentation(int N, StringBuilder binary) {

		if (N == 1) {
			binary.append(1).reverse();
			return binary;
		} else {
			binary.append(N % 2);
			return createBinaryRepresentation(N / 2, binary);
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
		int binaryGap = 0;
		int longestBinaryGap = 0;
	
		while (N != 1) {
			
			N = (N / 2);
			
			if (N % 2 == 0) {
				 binaryGap++;
			} 
			
			if (N % 2 == 1){
				if (longestBinaryGap < binaryGap) {
					longestBinaryGap = binaryGap;
					binaryGap = 0;
				} 
			}
		}
		return longestBinaryGap;
	}
}
