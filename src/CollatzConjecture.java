/**
 * 
 */

/**
 * .CollatzConjecture
 */
public class CollatzConjecture {

	/**
	 * Constructor
	 *
	 */
	public CollatzConjecture() {
	}

	private static long getCollatzValue(long num) {
		if (num % 2 == 0) {
			return num / 2;
		}
		return 3 * num + 1;
	}
	
	
	public static void getCollatz(long limit){
		long chainCount = 0;
		long num= 5000;
		long chainNum =0;
		while(num < limit){
			long count = 2;
			long res = getCollatzValue(num);
			while(res > 1 ){
				count++;
				res = getCollatzValue(res);
			}
			
			if(count > chainCount){
				chainCount = count;
				chainNum = num;
			}
			num++;
		}
		System.out.println("Chaincount:"+chainCount + " num:"+chainNum);
	}
	

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		getCollatz(1000001);
	}

}
