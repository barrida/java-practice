package timecomplexity;

public class FrogJmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * A small frog wants to get to the other side of the road. The frog is
	 * currently located at position X and wants to get to a position greater
	 * than or equal to Y. The small frog always jumps a fixed distance, D.
	 * 
	 * Count the minimal number of jumps that the small frog must perform to
	 * reach its target.
	 * 
	 * @param X
	 *            current position
	 * @param Y
	 *            target position
	 * @param D
	 *            fixed distance to jump
	 * @return solution
	 */
	public int solution(int X, int Y, int D) {

		/**
		 * counter = 0 
		 * if X == Y  return 0
		 * Add X + D. If X + D is less than Y, increase counter,
		 * repeat this. if X + D > Y increase counter and return counter.
		 */
		int numberOfJumps = 0;

		if (X == Y) {
			return 0;
		}
		
		while (X + D < Y) {
			++numberOfJumps;
			X = X + D;
		}

		return ++numberOfJumps;
	}

}
