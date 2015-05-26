import java.util.HashSet;
import java.util.Set;


public class PrimeFactors {

	public PrimeFactors() {
		// TODO Auto-generated constructor stub
	}

	public static Set<Long> primeFactors(long number) {
        Set<Long> primefactors = new HashSet<Long>();
        long copyOfInput = number;

        for (long i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                primefactors.add(i); // prime factor
                copyOfInput /= i;
                i--;
            }
        }
        return primefactors;
    }

	
	public static void main(String[] args) {
		System.out.printf("Prime factors of positive number '%d' is : %s %n", 600851475143l , primeFactors(600851475143l));
	}

}
