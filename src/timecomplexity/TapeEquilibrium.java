package timecomplexity;

public class TapeEquilibrium {

	public static void main(String[] args) {

		TapeEquilibrium s = new TapeEquilibrium();
		int[] A = new int[] {3,1,2,4,3};
		s.solution(A);
	}

	public int solution(int A[]) {
		int min = 0;
		for (int i = 0; i < A.length - 1; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for (int j = i; j >= 0; j--) {
				sum1 += A[j];
			}
			for (int j = (i + 1); j < A.length; j++) {
				sum2 += A[j];
			}
			if (i == 0)
				min = Math.abs(sum1 - sum2);
			else if (Math.abs(sum1 - sum2) < min)
				min = Math.abs(sum1 - sum2);
		}
		
		return min;
		
	}

}
