public class LargestPaladromeProduct {

	public LargestPaladromeProduct(long startValue) {
		getLargestPalidrome(startValue);
	}

	
	private void getLargestPalidrome(long value){
		long value1 = value;
		long value2 = value;
		long result;
		long palidrome = 0;
		
		while(value1 < 1000){
			while(value2 < 1000){
				result = value1 * value2;
				if(result == reverseNumber(result)){
					if(result > palidrome)
					palidrome = result;
				}
				value2++;
			}
			value2 =0;
			value1++;
		}
		System.out.println("largest "+palidrome);
	}	
	
	private long reverseNumber(long value) {
		long reversedNumber = 0;
		long temp = 0;

		while (value > 0) {
			temp = value % 10;
			reversedNumber = reversedNumber * 10 + temp;
			value = value / 10;
		}
//		System.out.println("Reversed Number is: "+ reversedNumber);
		return reversedNumber;
	}

	public static void main(String[] args) {
		new LargestPaladromeProduct(99);
	}

}
