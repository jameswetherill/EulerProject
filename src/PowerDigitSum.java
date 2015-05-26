import java.math.BigInteger;

/**
 * 
 */

/**
 * .PowerDigitSum
 */
public class PowerDigitSum {

	/**
	 * Constructor
	 *
	 */
	public PowerDigitSum() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		BigInteger value = new BigInteger("2");
		value = value.pow(1000);
		String in = value.toString();
		int result = 0;
		for (int i = 0; i < in.length();i++) {
			result +=  Integer.parseInt(""+in.charAt(i));			
		}
		System.out.println(result);
	}

}
