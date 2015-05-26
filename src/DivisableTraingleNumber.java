import java.util.HashSet;
import java.util.Set;


public class DivisableTraingleNumber {

	public DivisableTraingleNumber() {
	}

	final static int THRESHOLD = 500;

	 public static long getTriangle() {
	        int n = 1;
	        long currentSum = 0;
	        while (!hasOverXDivisors(currentSum, THRESHOLD)) {
	            currentSum += n;
	            n++;
	        }
	        return currentSum;
	    }

	    private static boolean hasOverXDivisors(long nr, int threshold) {
	        if ( nr <= threshold ) {
	            return false;
	        }
	        int divisors = 0;
	        int i;
	        int sqrt = (int) Math.sqrt(nr);
	        for ( i = 1 ; i <= sqrt ; i++ ) {
	            if ( nr % i == 0 ) {
	                divisors+=2;           // E.g.: (2, n/2), (3, n/3)
	            }
	        }
	        if ( sqrt*sqrt == nr ){        // it was counted twice
	            divisors--;
	        }
	        if ( divisors > threshold ) {
	            return true;
	        }
	        return false;
	    }

	public static void getDivisableTriangle(int limit){
		long highestCount= 0;
		Set<Long> divisors = new HashSet<Long>();
		long number =10000000;
		long increment = 1;
		while (true) {
			for (long i = 1; i <= Math.sqrt(number);i++){
				divisors.add(new Long(gcd(number, i)));				
			}

			if(divisors.size() > highestCount)
				highestCount = divisors.size() * 2;
			divisors  = new HashSet<Long>();
			if(highestCount >= limit)
				break;
			increment++;
			number += increment;
			
		}
		System.out.println("number "+ number + "  count "+highestCount);
	}
	
	/**
	 * Return the greatest common divisor
	 * @param a
	 * @param b
	 * @return long
	 */
	public static long gcd(long a, long b) {	 
	   if (b==0) 
	     return a;
	   else
	     return gcd(b, a % b);
	 }
	 
	public static void main(String[] args) {
//		System.out.println("divisor" + gcd(21,15));
//		getDivisableTriangle(500);
		System.out.println(getTriangle());
	}

}
