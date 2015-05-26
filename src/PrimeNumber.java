public class PrimeNumber {

	public static long getPrime( int primeCount) {
		long prime = 0;
		int count = 0;
		long number = 0;
		while(true) {
			number++;
			// print prime numbers only
			if (isPrime(number)) {
				prime = number;
				if (count == primeCount){
					break;
				}
				count++;
			}
		}
		return prime;
	}

	/*
	 * Prime number is not divisible by any number other than 1 and itself
	 * @return true if number is prime
	 */
	public static boolean isPrime(long number) {
		for (long i = 2; i < number; i++) {
			if (number % i == 0) {
				return false; // number is divisible so its not prime
			}
		}
		return true; // number is prime now
	}

	public PrimeNumber() {
		
	}
	public static void main(String[] args) {
		System.out.println("prime "+ getPrime(10001));
	}
}
