import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class MulitpleOfTwoNumbers {

	public MulitpleOfTwoNumbers(int value1, int value2, int limit) {
		List<Integer> values1 = getMultipleOfNum( value1, limit);
		List<Integer> values2 = getMultipleOfNum( value2, limit);
		System.out.println("Sum is "+sumValues(combineLists(values1,values2)));
	}
	
	private int sumValues(Set<Integer> set) {
		int sum = 0;
		for (Integer integer : set) {
			sum += integer;
		}
		return sum;
	}

	private Set<Integer> combineLists(List<Integer> values1, List<Integer> values2){
		Set<Integer> list3 = new LinkedHashSet<Integer>();
	      list3.addAll(values1);
	      list3.addAll(values2);
		
		return list3;
	}
	
	private List<Integer> getMultipleOfNum(int value, int limit){
		List<Integer> sums = new ArrayList<Integer>();
		int start = value;
		while(start < limit){
			sums.add(new Integer(start));
			System.out.println(start);
			start+=value;
		}
		return sums;
	}
	

	public static void main(String[] args) {
		new MulitpleOfTwoNumbers(3,5,1000);

	}

}
