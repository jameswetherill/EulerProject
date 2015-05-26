public class SumSquareDifference {

	public SumSquareDifference() {
	}

	private static long sumOfSquares(long max) {
		long ret = 0;
		for (int i = 1; i <= max; i++) {
			ret += i * i;
		}
		return ret;
	}
	
	private static long squaresOfSums(long max) {
		long ret = 0;
		for (int i = 1; i <= max; i++) {
			ret += i;
		}
		return ret * ret;
	}

	public static void main(String[] args) {
		System.out.println("value " + sumOfSquares(10));
		System.out.println("value " + squaresOfSums(10));
		System.out.println("value"+(squaresOfSums(100) - sumOfSquares(100)));
	}

}
