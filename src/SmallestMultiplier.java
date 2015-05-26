
public class SmallestMultiplier {

	public SmallestMultiplier(int bottomRange, int topRange) {
		smallestMultiplier( bottomRange,  topRange);
	}

	private void smallestMultiplier(int bottomRange, int topRange){
		int value = topRange;
		while (true){
			boolean found = true;
			for(int i = bottomRange; i <= topRange; i++ ){
				boolean val = divisableNoRemainder( value, i);
				if(found && !val){
					found = false;
				} 				
			}
			if(found){
				break;			
			}
			value+=topRange;
		}
		
		System.out.println("value :"+value);
	}
	
	private boolean divisableNoRemainder(int value, int divisor){
		return value%divisor == 0?true:false;
	}
	
	public static void main(String[] args) {
		new SmallestMultiplier(1, 20);

	}

}
