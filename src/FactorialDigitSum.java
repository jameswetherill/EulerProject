import java.math.BigInteger;

/**
 * 
 */

/**
 * .factorialDigitSum
 */
public class FactorialDigitSum {

	/**
	 * Constructor
	 *
	 */
	public FactorialDigitSum() {
		// TODO Auto-generated constructor stub
	}

	static BigInteger factorialDigit(BigInteger n) {
		if (n.equals(BigInteger.ONE))
			return n;
		return n.multiply(factorialDigit(n.subtract(BigInteger.ONE)));
	}

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		String nums = factorialDigit(BigInteger.valueOf(100)).toString();
		System.out.println(nums);
		char[] lets = nums.toCharArray();
		BigInteger value = new BigInteger(""+0);
		for (char c : lets) {
			value = value.add(new BigInteger(""+c));
		}
		System.out.println(value.toString());
	}

}
