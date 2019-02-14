package coursera.week1;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class MaxPairwiseProduct {
	static BigInteger getMaxPairwiseProduct(int[] numbers) {

		
		// int n = numbers.length;
		BigInteger n = BigInteger.valueOf(numbers.length);

		int maxIndex1 = -1;
		// for (int first = 0; first < n; first++) {
		// if ((maxIndex1 == -1) || (numbers[first] > numbers[maxIndex1]))
		// maxIndex1 = first;
		// }

		for (BigInteger first = BigInteger.valueOf(0); first.compareTo(n) < 0; first = first.add(BigInteger.ONE)) {
			int value = (int) first.intValue();
			if ((maxIndex1 == -1) || (numbers[value] > numbers[maxIndex1]))
				maxIndex1 = value;
		}

		int maxIndex2 = -1;
		for (BigInteger second = BigInteger.valueOf(0); second.compareTo(n) < 0; second = second.add(BigInteger.ONE)) {
			int value = (int) second.intValue();
			if ((numbers[value] != numbers[maxIndex1])
					&& ((maxIndex2 == -1) || (numbers[value] > numbers[maxIndex2])))
				maxIndex2 = value;
		}

		return BigInteger.valueOf(numbers[maxIndex1]).multiply(BigInteger.valueOf(numbers[maxIndex2]));
	}

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(getMaxPairwiseProduct(numbers));
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

}