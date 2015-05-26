import java.util.ArrayList;
import java.util.List;

public class SumEvenFibanacciNumbers {

	public SumEvenFibanacciNumbers(int limit) {
		List<Long> fibs = getFibonacciNumbers(limit);
		System.out.println("Sums " + sumValues(fibs));
	}

	private int sumValues(List<Long> set) {
		int sum = 0;
		for (Long Long1 : set) {
			System.out.println("values " + Long1);
			if (Long1 % 2l == 0) {
				sum += Long1;
			}
		}
		return sum;
	}

	private List<Long> getFibonacciNumbers(int limit) {
		List<Long> nums = new ArrayList<Long>();
		nums.add( 0l);
		nums.add(1l);
		for (int i = 2; nums.get(i-1) < limit; i++) {			
			nums.add((nums.get(i - 1)) + (nums.get(i - 2)));
		}
		return nums;
	}

	

	public static void main(String[] args) {
		new SumEvenFibanacciNumbers(4000000);
	}

}
