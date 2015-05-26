import java.math.BigInteger;

/**
 * 
 */

/**
 * .LatticePaths
 */
public class LatticePaths {

	/**
	 * Constructor
	 *
	 */
	public LatticePaths() {
		// TODO Auto-generated constructor stub
	}

	public static BigInteger factorial(final BigInteger n) {
		if (n.equals(new BigInteger("1")))
			return new BigInteger("1");
		else
			return n.multiply(factorial(n.subtract(new BigInteger("1"))));
	}

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		BigInteger n = new BigInteger("20");
		BigInteger value = factorial((n.add(n))).divide((factorial(n).multiply(factorial(n))));
		System.out.println("value"+value);
	}

}
