
public class PrimeSums {

	public PrimeSums() {
		// TODO Auto-generated constructor stub
	}

	public static long getPrime( int primeCount) {
		long prime = 0;
		int count = 0;
		long number = 0;
		while(true) {
			number++;
			if (isPrime(number)) {
				System.out.println(number);
				prime += number;				
			}
			count++;
			if (count == primeCount){
				break;
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
				return false; 
			}
		}
		if(number == 1) return false;
		return true; 
	}
	
	public static void main(String[] args) {
		System.out.println("prime sum"+ getPrime(2000000));

	}

}
